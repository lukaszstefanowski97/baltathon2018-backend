package com.baltathon2018backend;


import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room getRoomById(Long id) {
        Room room = roomRepository.findById(id).get();
        return room;
    }

    public void addRoom(Room room){
        roomRepository.save(room);
    }
}
