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

    public void createTodoItem(String description){
       todoItemRepository.save(new TodoItem(description));
    }

    public void updateTodoItem(Integer id, String description) {
        TodoItem item = todoItemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Item not found with id: " + id));
        item.setDescription(description);
        todoItemRepository.save(item);
    }

    public void deleteTodoItem(Integer id) {
        todoItemRepository.delete(new TodoItem(id));
    }

}
