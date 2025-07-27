package com.carlos.adivina.api_partidas.model;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jugador;
    private int intentos;
    private LocalDate fecha;

    public Partida() {}

    public Partida(String jugador, int intentos, LocalDate fecha) {
        this.jugador = jugador;
        this.intentos = intentos;
        this.fecha = fecha;
    }

    // Getters y Setters
    public Long getId() { return id; }

    public String getJugador() { return jugador; }
    public void setJugador(String jugador) { this.jugador = jugador; }

    public int getIntentos() { return intentos; }
    public void setIntentos(int intentos) { this.intentos = intentos; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}
