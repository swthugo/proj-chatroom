package dev.hugosiu.Chatbot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponse {
  private String token;
}
