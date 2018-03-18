package com.baltathon2018backend;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Fish {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String photoURL;
    private String curiosities;
    @OneToMany
    private List<Like> likes;


    public Fish(String name) {
        this.name = name;
    }
}
