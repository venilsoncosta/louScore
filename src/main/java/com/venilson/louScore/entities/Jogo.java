package com.venilson.louScore.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Jogo {

    private Long id;
    private Equipe timeDaCasa;
    private Equipe timeVisitante;
    private Integer golsTimeCasa;
    private Integer golsTimeVisitante;
}
