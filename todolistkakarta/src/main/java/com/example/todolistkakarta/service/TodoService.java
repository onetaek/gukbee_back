package com.example.todolistkakarta.service;


import com.example.todolistkakarta.dao.TodoDao;
import com.example.todolistkakarta.dto.TodoDto;
import com.example.todolistkakarta.util.MapperUtil;
import com.example.todolistkakarta.vo.TodoVo;
import org.modelmapper.ModelMapper;

public enum TodoService {
    INSTANCE;
    private TodoDao dao;
    private ModelMapper modelMapper;
    TodoService(){
        dao = new TodoDao();
        modelMapper = MapperUtil.INSTANCE.get();
    }
    public void register(TodoDto todoDto) throws Exception{
        TodoVo todoVo = modelMapper.map(todoDto, TodoVo.class);
        System.out.println("todoVo = " + todoVo);
        dao.insert(todoVo);
    }
}
