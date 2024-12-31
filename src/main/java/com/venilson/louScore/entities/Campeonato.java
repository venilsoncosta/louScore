package com.venilson.louScore.entities;

import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Campeonato {

    private Long id;
    private String nome;

    @OneToMany
    private List<Equipe> equipes = new ArrayList<>();
}
