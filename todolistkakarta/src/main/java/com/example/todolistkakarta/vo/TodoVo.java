package com.example.todolistkakarta.vo;

import lombok.*;

import java.time.LocalDate;
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TodoVo {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}
