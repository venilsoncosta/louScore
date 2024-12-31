package com.venilson.louScore.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Equipe {

    private Long id;
    private String nome;
    private final List<Jogador> jogadores = new ArrayList<>();
}
