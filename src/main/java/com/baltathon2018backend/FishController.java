package com.baltathon2018backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("fish")
public class FishController {

    private final FishService fishService;

    public FishController(FishService fishService) {
        this.fishService = fishService;
    }

    @GetMapping("{fishId}")
    public Fish getFishById(@PathVariable Long fishId) {
        Fish fish = fishService.getFishById(fishId);
        return fish;
    }

    @PostMapping("Adolf_Hitler1234")
    public void addFish(@RequestBody Fish fish){
        fishService.addFish(fish);
    }
}
