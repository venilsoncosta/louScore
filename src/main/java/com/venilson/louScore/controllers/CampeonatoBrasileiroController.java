package com.venilson.louScore.controllers;

import com.venilson.louScore.entities.campeonatos.CampeonatoBrasileiro;
import com.venilson.louScore.services.CampeonatoBrasileiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatoBrasileiroController {

    @Autowired
    private CampeonatoBrasileiroService service;

    @PostMapping
    public ResponseEntity<CampeonatoBrasileiro> criarCampeonato(@RequestBody CampeonatoBrasileiro campeonatoBrasileiro) {
        try {
            CampeonatoBrasileiro campeonato = service.criarCampeonato(campeonatoBrasileiro);
            return ResponseEntity.status(HttpStatus.CREATED).body(campeonato);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
