package org.dailystudio.springbootstudy.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.dailystudio.springbootstudy.dto.team.TeamNameChangeReqDto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "team")
@Getter
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member> members;

    @Builder
    public Team(String name) {
        this.name = name;
    }

    public void changeName(TeamNameChangeReqDto teamNameChangeReqDto) {
        this.name = teamNameChangeReqDto.getName();
    }
}
