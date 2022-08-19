package xyz.dimitr.mstodo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.dimitr.mstodo.model.Todo;
import xyz.dimitr.mstodo.repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    @Transactional
    public Optional<Todo> getById(Long id) {
        return todoRepository.findById(id);
    }

    @Transactional
    public List<Todo> getAllTodosByUser(Long userId) {
        return todoRepository.findByUserId(userId);
    }

    @Transactional
    public List<Todo> getActiveTodosByUser(Long userId) {
        return todoRepository.findByUserIdAndStatus(userId, "Y");
    }

    @Transactional
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
    
    @Transactional
    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Transactional
    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }
}
