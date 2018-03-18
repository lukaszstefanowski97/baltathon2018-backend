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

    @PostMapping
    public Fish addFish(@RequestBody Fish fish){
        return fishService.addFish(fish);
    }

    @PutMapping
    public void editFish(@RequestBody Fish fish) {
        fishService.editFish(fish);
    }

    @PutMapping("/{fishId}/{aquariumId}")
    public void addFishToAnotherAquarium(@PathVariable Long fishId,
                                         @PathVariable Long aquariumId) {
        fishService.addFishToAnotherAquarium(fishId, aquariumId);

    }
}
