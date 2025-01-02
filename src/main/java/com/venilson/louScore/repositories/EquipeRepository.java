package com.venilson.louScore.repositories;

import com.venilson.louScore.entities.equipes.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
