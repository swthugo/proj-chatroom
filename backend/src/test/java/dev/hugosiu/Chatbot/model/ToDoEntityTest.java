package dev.hugosiu.Chatbot.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDoEntityTest {

    @Test
    public void whenGetId_ThenSetId() {
        ToDo todo = new ToDo();
        todo.setId(1);
        Integer expected = 1;
        Integer actual = todo.getId();

        assertEquals(expected, actual);
    }
}
