package com.venilson.louScore.controllers;

import com.venilson.louScore.entities.equipes.Equipe;
import com.venilson.louScore.services.EquipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipes")
public class EquipeController {

    @Autowired
    private EquipeService equipeService;

    public void criarEquipe(@Valid @RequestBody Equipe equipe){
        equipeService.criarEquipe(equipe);
    }
}
