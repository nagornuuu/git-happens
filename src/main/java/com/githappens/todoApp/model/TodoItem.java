package com.githappens.todoApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoItem {

    private Integer id;
    private String description;
    private boolean completed;


    public TodoItem(String description){
        this.description=description;
        this.completed=false;
    }
}
