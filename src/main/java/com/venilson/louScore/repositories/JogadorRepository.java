package com.venilson.louScore.repositories;

import com.venilson.louScore.entities.jogadores.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
