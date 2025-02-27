package dev.hugosiu.Chatbot.controller.auth;


import dev.hugosiu.Chatbot.config.JwtUtil;
import dev.hugosiu.Chatbot.model.AuthResponse;
import dev.hugosiu.Chatbot.model.User;
import dev.hugosiu.Chatbot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  private static final Logger logger = LogManager.getLogManager().getLogger(String.valueOf(AuthController.class));

  @Autowired
  private UserService userService;

  @Autowired
  private JwtUtil jwtUtil;

  @PostMapping("/signup")
  public ResponseEntity<?> register(@RequestBody User user) {
    User newUser = userService.register(user);
    return ResponseEntity.ok("User registered successfully");
  }

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody User user){
    logger.info("Login attempt for user: "+ user.getUsername());

    String token = jwtUtil.generateToken(user.getUsername());
    return ResponseEntity.ok(AuthResponse.builder().token(token).build());
  }
}
