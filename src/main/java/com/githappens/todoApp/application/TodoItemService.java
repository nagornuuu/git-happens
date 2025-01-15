package com.githappens.todoApp.application;

import com.githappens.todoApp.infrastructure.repository.TodoItemRepository;
import com.githappens.todoApp.model.TodoItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoItemService {

    private final TodoItemRepository todoItemRepository;

    public TodoItemService(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    public List<TodoItem> getTodoItem() {
        return todoItemRepository.findAll();
    }

}
