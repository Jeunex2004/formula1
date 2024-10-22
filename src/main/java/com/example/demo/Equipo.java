package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Equipo implements ISponsoreable {
    private String nombre;
    private List<SponsorContrato> contratosDePatrocinio;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.contratosDePatrocinio = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public List<SponsorContrato> getSponsors() {
        return contratosDePatrocinio;
    }

    @Override
    public void agregar(SponsorContrato contrato) {
        contratosDePatrocinio.add(contrato);
    }

    @Override
    public void agregar(Sponsor sponsor, String ubicacion, String fechaDesde) {
        SponsorContrato contrato = new SponsorContrato(sponsor, ubicacion, fechaDesde);
        contratosDePatrocinio.add(contrato);
    }

    @Override
    public void remover(Sponsor sponsor) {
        contratosDePatrocinio.removeIf(contrato -> contrato.getSponsor().equals(sponsor));
    }

    @Override
    public void remover(String nombreSponsor) {
        contratosDePatrocinio.removeIf(contrato -> contrato.getSponsor().getNombre().equals(nombreSponsor));
    }

    @Override
    public void remover(Sponsor sponsor, String ubicacion) {
        contratosDePatrocinio.removeIf(contrato -> contrato.getSponsor().equals(sponsor) && contrato.getUbicacion().equals(ubicacion));
    }

    @Override
    public List<SponsorContrato> sponsorsHabilitados() {
        List<SponsorContrato> habilitados = new ArrayList<>();
        for (SponsorContrato contrato : contratosDePatrocinio) {
            if (contrato.getFechaHasta() == null) {
                habilitados.add(contrato);
            }
        }
        return habilitados;
    }
}

