package com.venilson.louScore.controllers;

import com.venilson.louScore.entities.equipes.Equipe;
import com.venilson.louScore.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipes")
public class EquipeController {

    @Autowired
    private EquipeService equipeService;

    public ResponseEntity<Equipe> criarEquipe(Equipe equipe){
        try {
            Equipe equipeCriada = equipeService.criarEquipe(equipe);
            return ResponseEntity.ok(equipeCriada);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }
}
