package com.venilson.louScore.services;

import com.venilson.louScore.entities.equipes.Equipe;
import com.venilson.louScore.repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository equipeRepository;

    public void criarEquipe(Equipe equipe){
        equipeRepository.save(equipe);
    }
}
