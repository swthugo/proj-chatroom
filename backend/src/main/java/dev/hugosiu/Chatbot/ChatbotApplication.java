package dev.hugosiu.Chatbot;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@Log4j
@SpringBootApplication
public class ChatbotApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatbotApplication.class, args);
    }

    ApplicationRunner applicationRunner(Environment environment) {
        return args -> {
            log.info("message from application.properties" + environment.getProperty("message-from-application-properties"));
        };
    }
}
