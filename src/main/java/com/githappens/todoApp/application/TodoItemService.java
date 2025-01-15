package com.githappens.todoApp.application;

import com.githappens.todoApp.model.TodoItem;
import org.springframework.stereotype.Service;



@Service
public class TodoItemService {

    public void createTodoItem(String description){
        new TodoItem(description);
    }

}
