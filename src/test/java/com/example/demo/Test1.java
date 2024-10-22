package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

@SpringBootTest
public class Test1 {
    
    private Equipo equipo;
    private Sponsor sponsor1;
    private Sponsor sponsor2;

    @BeforeEach
    public void setUp() {
        equipo = new Equipo("Equipo de Prueba");
        sponsor1 = new Sponsor("Red Bull");
        sponsor2 = new Sponsor("Ferrari");
    }

    @Test
    public void testAgregarSponsorContrato() {
        SponsorContrato contrato1 = new SponsorContrato(sponsor1, "Coche", "2023-01-01");
        
        equipo.agregar(contrato1);
        
        List<SponsorContrato> sponsors = equipo.getSponsors();
        assertEquals(1, sponsors.size(), "Debe haber un contrato de patrocinio");
        assertEquals(sponsor1, sponsors.get(0).getSponsor(), "El patrocinador debe ser Red Bull");
    }

    @Test
    public void testAgregarSponsorConDatos() {
       
        equipo.agregar(sponsor2, "Mono", "2023-02-01");

     
        List<SponsorContrato> sponsors = equipo.getSponsors();
        assertEquals(1, sponsors.size(), "Debe haber un contrato de patrocinio");
        assertEquals(sponsor2, sponsors.get(0).getSponsor(), "El patrocinador debe ser Ferrari");
    }

    @Test
    public void testRemoverSponsor() {
      
        equipo.agregar(sponsor1, "Coche", "2023-01-01");
        equipo.remover(sponsor1);

       
        List<SponsorContrato> sponsors = equipo.getSponsors();
        assertEquals(0, sponsors.size(), "No debe haber patrocinadores después de remover");
    }

    @Test
    public void testRemoverSponsorPorNombre() {
        equipo.agregar(sponsor1, "Coche", "2023-01-01");
        equipo.agregar(sponsor2, "Mono", "2023-02-01");

       
        equipo.remover("Red Bull");

        
        List<SponsorContrato> sponsors = equipo.getSponsors();
        assertEquals(1, sponsors.size(), "Debe quedar un patrocinador");
        assertEquals(sponsor2, sponsors.get(0).getSponsor(), "El patrocinador restante debe ser Ferrari");
    }

    @Test
    public void testSponsorsHabilitados() {
    
        SponsorContrato contrato1 = new SponsorContrato(sponsor1, "Coche", "2023-01-01");
        contrato1.setFechaHasta("2023-06-01");
        equipo.agregar(contrato1);

        SponsorContrato contrato2 = new SponsorContrato(sponsor2, "Mono", "2023-02-01");
        equipo.agregar(contrato2);


        List<SponsorContrato> habilitados = equipo.sponsorsHabilitados();
        assertEquals(1, habilitados.size(), "Debe haber un patrocinador habilitado");
        assertEquals(sponsor2, habilitados.get(0).getSponsor(), "El patrocinador habilitado debe ser Ferrari");
    }
}
