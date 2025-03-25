package com.godev.chatroom.controller;

import com.godev.chatroom.model.Room;
import com.godev.chatroom.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
        Room createdRoom = roomService.createRoom(room);
        return ResponseEntity.ok(createdRoom);
    }

    @GetMapping("/member/{memberId}")
    public ResponseEntity<List<Room>> getRoomsByMemberId(@PathVariable Long roomId) {
        List<Room> rooms = roomService.getRoomsByRoomId(roomId);
        return ResponseEntity.ok(rooms);
    }
}