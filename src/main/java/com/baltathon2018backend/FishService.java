package com.baltathon2018backend;

import org.springframework.stereotype.Service;

@Service
public class FishService {
    private final FishRepository fishRepository;

    public FishService(FishRepository fishRepository) {
        this.fishRepository = fishRepository;
    }

    public Fish getFishById(Long id) {
        Fish fish = fishRepository.findById(id).get();
        return fish;
    }

    public void addFish(Fish fish){
        fishRepository.save(fish);
    }

}
