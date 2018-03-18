package com.baltathon2018backend;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Aquarium {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany
    private List<Fish> fishes;

    public void addFish(Fish fish){
        this.fishes.add(fish);
    }
}
