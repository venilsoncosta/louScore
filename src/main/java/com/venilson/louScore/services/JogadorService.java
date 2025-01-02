package com.venilson.louScore.services;

import com.venilson.louScore.entities.jogadores.Jogador;
import com.venilson.louScore.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public Jogador criarJogador(Jogador jogador){
        return jogadorRepository.save(jogador);
    }
}
