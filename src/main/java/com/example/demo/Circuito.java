package com.example.demo;

public class Circuito {
    
    private String nombre;
    private double longitud;
    private int vueltasCantidad;

    public Circuito(String nombre, double longitud, int vueltasCantidad) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.vueltasCantidad = vueltasCantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public int getVueltasCantidad() {
        return vueltasCantidad;
    }
}
