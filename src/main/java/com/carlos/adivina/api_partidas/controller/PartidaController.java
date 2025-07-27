package com.carlos.adivina.api_partidas.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.adivina.api_partidas.model.Partida;
import com.carlos.adivina.api_partidas.repository.PartidaRepository;

@RestController
@RequestMapping("/api/partidas")
public class PartidaController {

    private final PartidaRepository repo;

    public PartidaController(PartidaRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Partida> obtenerTodas() {
        return repo.findAll();
    }

    @PostMapping
    public Partida guardar(@RequestBody Partida partida) {
        partida.setFecha(LocalDate.now());
        return repo.save(partida);
    }
}
