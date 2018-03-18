package com.baltathon2018backend;


import org.springframework.stereotype.Service;

@Service
public class AquariumService {
    private final AquariumRepository aquariumRepository;

    public AquariumService(AquariumRepository aquariumRepository) {
        this.aquariumRepository = aquariumRepository;
    }

    public Aquarium getAquariumById(Long id) {
        Aquarium aquarium = aquariumRepository.findById(id).get();
        return aquarium;
    }

    public void addAquarium(Aquarium aquarium){
        aquariumRepository.save(aquarium);
    }


}

