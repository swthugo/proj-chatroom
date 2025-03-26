package com.godev.chatroom.controller;

import com.godev.chatroom.model.Message;
import com.godev.chatroom.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<Message> sendMessage(@RequestBody Message message) {
        Message sentMessage = messageService.sendMessage(message);
        return ResponseEntity.ok(sentMessage);
    }

//    @GetMapping("/room/{roomId}")
//    public ResponseEntity<List<Message>> getMessagesByRoomId(@PathVariable Long roomId) {
//        List<Message> messages = messageService.getMessagesByRoomId(roomId);
//        return ResponseEntity.ok(messages);
//    }
}