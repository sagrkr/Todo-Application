package com.sagar.todoapp.Services;

import com.sagar.todoapp.Repositories.TodoItemRepository;
import com.sagar.todoapp.models.TodoItem;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.util.Optional;

public class TodoItemServices {
    @Autowired
    private TodoItemRepository todoItemRepository;

    public Iterable<TodoItem> getAll(){
        return todoItemRepository.findAll();
    }

    public Optional<TodoItem> getById(Long id){
        return todoItemRepository.findById(id);
    }

    public TodoItem save(TodoItem todoItem){
        if(todoItem.getId() == null){
            todoItem.setCreatedAt(Instant.now());
        }
        todoItem.setUpdatedAt(Instant.now());
        return todoItemRepository.save(todoItem);
    }

    public void delete(TodoItem todoItem){
        todoItemRepository.delete(todoItem);
    }
}

