package com.venilson.louScore.controllers;

import com.venilson.louScore.entities.jogadores.Jogador;
import com.venilson.louScore.services.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public List<Jogador> listarJogadores(){
        return jogadorService.listarJogadores();
    }

    @PostMapping
    public void criarJogador(@Valid @RequestBody Jogador jogador){
        jogadorService.criarJogador(jogador);
    }
}
