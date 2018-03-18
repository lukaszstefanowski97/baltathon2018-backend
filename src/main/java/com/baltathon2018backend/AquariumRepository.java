package com.baltathon2018backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AquariumRepository extends JpaRepository<Aquarium, Long> {
    Optional<Aquarium> findById(Long id);
}
