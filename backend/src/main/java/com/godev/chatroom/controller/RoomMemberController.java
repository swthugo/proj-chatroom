package com.godev.chatroom.controller;

import com.godev.chatroom.model.RoomMember;
import com.godev.chatroom.service.RoomMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/room-members")
public class RoomMemberController {
    @Autowired
    private RoomMemberService roomMemberService;

    @PostMapping
    public ResponseEntity<RoomMember> addMemberToRoom(@RequestBody RoomMember roomMember) {
        RoomMember createdRoomMember = roomMemberService.addMemberToRoom(roomMember);
        return ResponseEntity.ok(createdRoomMember);
    }

//    @GetMapping("/room/{roomId}")
//    public ResponseEntity<List<RoomMember>> getMembersByRoomId(@PathVariable Long roomId) {
//        List<RoomMember> members = roomMemberService.getMembersByRoomId(roomId);
//        return ResponseEntity.ok(members);
//    }
}