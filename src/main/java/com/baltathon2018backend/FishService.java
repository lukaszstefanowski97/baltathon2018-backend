package com.baltathon2018backend;

import org.springframework.stereotype.Service;

@Service
public class FishService {
    private final FishRepository fishRepository;
    private final AquariumRepository aquariumRepository;

    public FishService(FishRepository fishRepository, AquariumRepository aquariumRepository) {
        this.fishRepository = fishRepository;
        this.aquariumRepository = aquariumRepository;
    }

    public Fish getFishById(Long id) {
        Fish fish = fishRepository.findById(id).get();
        return fish;
    }

    public Fish addFish(Fish fish){
        Fish savedFish = fishRepository.save(fish);
        return savedFish;
    }

    public void editFish(Fish fish){
        fishRepository.save(fish);
    }

    public void addFishToAnotherAquarium(Long fishId, Long aquariumId) {
        Fish fish = fishRepository.findById(fishId).get();
        Aquarium aquarium = aquariumRepository.findById(aquariumId).get();
        aquarium.addFish(fish);
        aquariumRepository.save(aquarium);
    }
}
