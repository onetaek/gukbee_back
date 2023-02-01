package com.example.todolistkakarta.dao;


import com.example.todolistkakarta.vo.TodoVo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoDaoTest {

    private TodoDao todoDao;

    @BeforeEach
    public void ready(){
        todoDao = new TodoDao();
    }

    @Test
    void testTime() throws Exception{
        System.out.println(todoDao.getTime());
    }

    @Test
    void testInsert() throws Exception{
        TodoVo todoVo = TodoVo.builder()
                .title("Sample Title...")
                .dueDate(LocalDate.of(2023,02,01))
                .build();
        todoDao.insert(todoVo);
    }

    @Test
    public void testSelectOne() throws Exception{
        Long tno = 2L;
//        TodoVo vo = todoDao.selectOne(tno);
//        System.out.println("vo = " + vo);
    }

    @Test
    public void testUpdateOne() throws Exception{
        TodoVo todoVo = TodoVo.builder()
                .tno(2L)
                .title("Sample Title...")
                .dueDate(LocalDate.of(2023,02,01))
                .build();
        todoDao.updateOne(todoVo);
    }
}