package com.godev.chatroom.service;

import com.godev.chatroom.model.Message;
import com.godev.chatroom.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> getMessagesByRoomId(Long roomId) {
        return messageRepository.findByRoomId(roomId);
    }
}
