package com.venilson.louScore.entities.equipes;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.venilson.louScore.entities.campeonatos.CampeonatoBrasileiro;
import com.venilson.louScore.entities.jogadores.Jogador;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clubes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String estadio;

    @ManyToOne
    private CampeonatoBrasileiro campeonatoBrasileiro;
}
