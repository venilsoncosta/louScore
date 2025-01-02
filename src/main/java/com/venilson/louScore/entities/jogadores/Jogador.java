package com.venilson.louScore.entities.jogadores;

import com.venilson.louScore.entities.equipes.Equipe;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "jogador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String posicao;
    @ManyToOne
    private Equipe equipe;
}
