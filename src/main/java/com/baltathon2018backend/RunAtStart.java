package com.baltathon2018backend;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RunAtStart {

    private final FishRepository fishRepository;

    public RunAtStart(FishRepository fishRepository) {
        this.fishRepository = fishRepository;
    }

    @PostConstruct
    public void init() {
        Fish fish = new Fish("janek");
        fishRepository.save(fish);
    }
}
