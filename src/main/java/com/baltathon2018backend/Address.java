package com.baltathon2018backend;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }
}