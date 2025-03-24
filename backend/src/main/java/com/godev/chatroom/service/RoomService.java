package com.godev.chatroom.service;

import com.godev.chatroom.model.Room;
import com.godev.chatroom.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public List<Room> getRoomsByRoomId(Long roomId) {
        return roomRepository.findByRoomId(roomId);
    }
}
