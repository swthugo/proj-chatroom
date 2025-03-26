package com.godev.chatroom.repository;

import com.godev.chatroom.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
//    List<Room> findByRoomId(Long roomId);
}
