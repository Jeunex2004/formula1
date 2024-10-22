package com.example.demo;

public class SponsorContrato {

    private Sponsor sponsor;
    private String ubicacion;
    private String fechaDesde;
    private String fechaHasta;

    public SponsorContrato(Sponsor sponsor, String ubicacion, String fechaDesde) {
        this.sponsor = sponsor;
        this.ubicacion = ubicacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = null;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    
}
