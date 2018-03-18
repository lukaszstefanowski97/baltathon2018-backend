package com.baltathon2018backend;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("room")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @GetMapping("{roomId}")
    public Room getRoomById(@PathVariable Long roomId) {
        Room room = roomService.getRoomById(roomId);
        return room;
    }

    @PostMapping("Adolf_Hitler1234")
    public void addRoom(@RequestBody Room room){
        roomService.addRoom(room);
    }


}
