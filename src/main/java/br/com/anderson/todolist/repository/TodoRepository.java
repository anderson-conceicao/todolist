package br.com.anderson.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anderson.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
