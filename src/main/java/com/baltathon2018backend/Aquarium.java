package com.baltathon2018backend;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Aquarium {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private List<Fish> fishes;
}
