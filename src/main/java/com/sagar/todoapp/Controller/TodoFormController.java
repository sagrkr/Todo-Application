package com.sagar.todoapp.Controller;

import com.sagar.todoapp.Services.TodoItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoFormController {
    @Autowired
    private TodoItemServices todoItemServices;

    @GetMapping("/create-todo")
    public String showCreateForm(){
        return "new-todo-item";
    }
}
