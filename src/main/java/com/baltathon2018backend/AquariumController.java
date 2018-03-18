package com.baltathon2018backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AquariumController {

    private final AquariumService aquariumService;

    public AquariumController(AquariumService aquariumService) {
        this.aquariumService = aquariumService;
    }

    @GetMapping("{aquariumId}")
    public Aquarium getAquariumById(@PathVariable Long aquariumId) {
        Aquarium aquarium = getAquariumById(aquariumId);
        return aquarium;
    }

    @PostMapping("Adolf_Hitler1234")
    public void addAquarium(@RequestBody Aquarium aquarium){
        aquariumService.addAquarium(aquarium);
    }
}
