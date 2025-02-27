package dev.hugosiu.Chatbot.repository;

import dev.hugosiu.Chatbot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
//  Optional<User> findByUsername(String username);
}
