package com.example.todolistkakarta.service;

import com.example.todolistkakarta.dto.TodoDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoServiceTest {
    private TodoService todoService;

    @BeforeEach
    public void ready(){
        todoService = TodoService.INSTANCE;
    }

    @Test
    public void testRegister() throws Exception{
        TodoDto todoDto = TodoDto.builder()
                .title("JDBC Test Title")
                .dueDate(LocalDate.now())
                .build();
        todoService.register(todoDto);
    }
}