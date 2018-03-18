package com.baltathon2018backend;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

    @Data
    @NoArgsConstructor
    @Entity
    public class User {
        @Id
        @GeneratedValue
        private Long id;
        private String name;
        private String sureName;
        @OneToOne
        private Address address;

        public User(String name, String sureName, Address address) {
            this.name = name;
            this.sureName = sureName;
            this.address = address;
        }
    }

