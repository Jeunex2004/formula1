package com.example.demo;
import java.util.List;

public interface ISponsoreable {

    List<SponsorContrato> getSponsors();

    void agregar(SponsorContrato contrato);

    void agregar(Sponsor sponsor, String ubicacion, String fechaDesde);

    void remover(Sponsor sponsor);

    void remover(String nombreSponsor);

    void remover(Sponsor sponsor, String ubicacion);
    
    List<SponsorContrato> sponsorsHabilitados();
}

