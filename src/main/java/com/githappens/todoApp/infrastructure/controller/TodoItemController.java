package com.githappens.todoApp.infrastructure.controller;

import com.githappens.todoApp.application.TodoItemService;
import com.githappens.todoApp.model.TodoItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoItemController {

    private final TodoItemService todoItemService;

    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @GetMapping
    public List<TodoItem> getItem() {
        return todoItemService.getTodoItem();
    }

}
