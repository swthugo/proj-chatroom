//package com.godev.chatroom.model;
//
//import jakarta.persistence.Embeddable;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.Objects;
//
//@Data
//@Embeddable
//@NoArgsConstructor
//@AllArgsConstructor
//public class RoomMemberId extends AbstractPersistentEntity<RoomMemberId> {
//    private Long roomId;
//    private Long accountId;
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        RoomMemberId that = (RoomMemberId) o;
//        return Objects.equals(roomId, that.roomId) && Objects.equals(accountId, that.accountId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(roomId, accountId);
//    }
//}
