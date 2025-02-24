package dev.hugosiu.Chatbot;

import dev.hugosiu.Chatbot.service.DatabaseService;
import lombok.extern.log4j.Log4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Log4j
@SpringBootApplication
public class ChatbotApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatbotApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(DatabaseService databaseService) {
        return args -> {
            databaseService.createTable();
        };
    }
}
