package com.example.demo;
import java.util.List;

public class Carrera {

    private String fecha;
    private Circuito circuito;
    private List<Piloto> participantes;

    public Carrera(String fecha, Circuito circuito, List<Piloto> participantes) {
        this.fecha = fecha;
        this.circuito = circuito;
        this.participantes = participantes;
    }

    public String getFecha() {
        return fecha;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public List<Piloto> getParticipantes() {
        return participantes;
    }

}
