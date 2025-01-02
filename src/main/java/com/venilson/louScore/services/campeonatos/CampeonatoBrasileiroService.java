package com.venilson.louScore.services.campeonatos;

import com.venilson.louScore.entities.campeonatos.CampeonatoBrasileiro;
import com.venilson.louScore.repositories.campeonatos.CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampeonatoBrasileiroService {

    @Autowired
    private CampeonatoRepository repository;

    public CampeonatoBrasileiro criarCampeonato(CampeonatoBrasileiro campeonatoBrasileiro){
        return repository.save(campeonatoBrasileiro);
    }
}
