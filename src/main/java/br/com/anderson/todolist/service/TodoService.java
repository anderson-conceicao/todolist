package br.com.anderson.todolist.service;

import java.util.List;

import br.com.anderson.todolist.entity.Todo;

public interface TodoService {
	
	
	   List<Todo> list() ;

	   List<Todo> create(Todo todo);

	   List<Todo> update(Long id, Todo todo) ;

	   List<Todo> delete(Long id) ;

}
