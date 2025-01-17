package com.githappens.todoApp.infrastructure.repository;

import com.githappens.todoApp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Integer> {
}
