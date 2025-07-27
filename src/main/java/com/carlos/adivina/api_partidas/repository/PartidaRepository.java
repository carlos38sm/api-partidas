package com.carlos.adivina.api_partidas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carlos.adivina.api_partidas.model.Partida;
import com.carlos.adivina.api_partidas.model.Partida;



public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
