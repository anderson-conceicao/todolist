package br.com.anderson.todolist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anderson.todolist.entity.Todo;
import br.com.anderson.todolist.service.TodoServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TodoController {
	@Autowired
	private TodoServiceImpl todoServiceImpl;

	@PostMapping
	ResponseEntity<List<Todo>> create(@Valid @RequestBody Todo todo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(todoServiceImpl.create(todo));
	}

	@GetMapping
	ResponseEntity<List<Todo>> list() {
		return ResponseEntity.status(HttpStatus.OK).body(todoServiceImpl.list());
	}

	@PutMapping("{id}")
	ResponseEntity<List<Todo>> update(@PathVariable Long id, @RequestBody Todo todo) {
		return ResponseEntity.status(HttpStatus.OK).body(todoServiceImpl.update(id, todo));
	}

	@DeleteMapping("{id}")
	ResponseEntity<List<Todo>> delete(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(todoServiceImpl.delete(id));
	}
}
