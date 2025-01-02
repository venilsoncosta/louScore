package com.venilson.louScore.repositories.campeonatos;

import com.venilson.louScore.entities.campeonatos.CampeonatoBrasileiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampeonatoRepository extends JpaRepository<CampeonatoBrasileiro, Long> {
}
