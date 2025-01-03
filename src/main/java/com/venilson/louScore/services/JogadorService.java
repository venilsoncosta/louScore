package com.venilson.louScore.services;

import com.venilson.louScore.entities.jogadores.Jogador;
import com.venilson.louScore.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> listarJogadores(){
        return jogadorRepository.findAll();
    }

    public void criarJogador(Jogador jogador){
        jogadorRepository.save(jogador);
    }
}
