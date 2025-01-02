package com.venilson.louScore.controllers.campeonatos;

import com.venilson.louScore.entities.campeonatos.CampeonatoBrasileiro;
import com.venilson.louScore.services.campeonatos.CampeonatoBrasileiroService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public CampeonatoBrasileiro criarCampeonato(@RequestBody CampeonatoBrasileiro campeonatoBrasileiro){
        return service.criarCampeonato(campeonatoBrasileiro);
    }
}
