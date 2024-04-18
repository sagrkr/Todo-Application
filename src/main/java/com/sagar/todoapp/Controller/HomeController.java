package com.sagar.todoapp.Controller;

import org.springframework.stereotype.Controller;
import com.sagar.todoapp.Services.TodoItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private TodoItemServices todoItemServices;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems", todoItemServices.getAll());
        return modelAndView;
    }

}
