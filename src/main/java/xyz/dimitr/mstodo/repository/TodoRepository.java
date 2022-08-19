package xyz.dimitr.mstodo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.dimitr.mstodo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    Optional<Todo> findById(Long id);

    List<Todo> findByUserId(Long userId);

    List<Todo> findByUserIdAndStatus(Long userId, String status);

}