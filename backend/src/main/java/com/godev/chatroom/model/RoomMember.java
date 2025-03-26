//package com.godev.chatroom.model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//@Data
//@Entity
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "room_member")
//public class RoomMember {
//
//    @Id
//    private RoomMemberId id;
//
//    @ManyToOne
//    @JoinColumn(name = "roomId", nullable = false)
//    @MapsId("roomId")
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    private Room room;
//
//    @ManyToOne
//    @JoinColumn
//    @MapsId("accountId")
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    private Account account;
//}
