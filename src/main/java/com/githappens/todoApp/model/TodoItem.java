package com.githappens.todoApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoItem {

    private Long id;
    private String description;
    private boolean completed;

}
