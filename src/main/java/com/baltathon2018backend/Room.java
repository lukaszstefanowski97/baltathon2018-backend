package com.baltathon2018backend;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<Aquarium> aquariums;

    public Room(String name) {
        this.name = name;
    }
}
