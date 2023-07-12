package br.com.anderson.todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.anderson.todolist.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    private static final long serialVersionUID = 1L;

	{
      add(new Todo(9995L, "@anderson", "Fazer Compras", false, 1));
      add(new Todo(9996L, "@anderson", "Lavar Carro", false, 1));
      add(new Todo(9997L, "@anderson", "Estudar", false, 1));
      add(new Todo(9998L, "@anderson", "Trabalhar", false, 1));
      add(new Todo(9999L, "@anderson", "Malhar", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}