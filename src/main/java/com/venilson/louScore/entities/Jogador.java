package com.venilson.louScore.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Jogador {

    private Long id;
    private String nome;
    private String posicao;
    private Equipe equipe;
}
