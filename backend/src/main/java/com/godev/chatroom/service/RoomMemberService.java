package com.godev.chatroom.service;

import com.godev.chatroom.model.RoomMember;
import com.godev.chatroom.repository.RoomMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomMemberService {
    @Autowired
    private RoomMemberRepository roomMemberRepository;

    public RoomMember addMemberToRoom(RoomMember roomMember) {
        return roomMemberRepository.save(roomMember);
    }

    public List<RoomMember> getMemberByRoomId(Long roomId) {
        return roomMemberRepository.findByRoomId(roomId);
    }
}
