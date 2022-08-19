package xyz.dimitr.mstodo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import xyz.dimitr.mstodo.model.Todo;
import xyz.dimitr.mstodo.model.TodoDto;
import xyz.dimitr.mstodo.service.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(value = "/api/todo")
public class TodoController {
    
    @Autowired
    TodoService todoService;

    @GetMapping(value = "/{id}")
    public  List<Todo> getAllTodos(@PathVariable("id") Long userId) {
        return todoService.getAllTodosByUser(userId);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTodo(@PathVariable("id") Long id) {
        todoService.deleteTodo(id);
    }

    @PostMapping(value="/")
    public Todo addTodo(@RequestBody TodoDto todoDto) {
        Todo todo = new Todo();
        todo.setUserId(todoDto.getUserId());
        todo.setName(todoDto.getName());
        todo.setDescription(todoDto.getDescription());
        todo.setCreateDate(new Date());
        todo.setReminderDate(todoDto.getReminderDate());
        todo.setStatus(todoDto.getStatus());
        return todoService.addTodo(todo) != null ? todo : null;
    }

    // @PutMapping(value = "/todo")
    // public Todo updateTodo(@RequestBody TodoDto todoDto) {
    //     Todo todo = todoService.getById(id)
    //     todo.setUserId(todoDto.getUserId());
    //     todo.setName(todoDto.getName());
    //     todo.setDescription(todoDto.getDescription());
    //     return todoService.updateTodo(todo) != null ? todo : null;
    // }
    

}
