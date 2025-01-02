package com.venilson.louScore.entities.campeonatos;

import com.venilson.louScore.entities.equipes.Equipe;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "brasileirao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CampeonatoBrasileiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer rodadas = 0;
    @OneToMany
    private List<Equipe> equipes;
}
