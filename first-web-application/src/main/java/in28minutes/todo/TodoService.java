package in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();

	static {
		todos.add(new Todo("Learn Web Application"));
		todos.add(new Todo("Learn Spring"));
		todos.add(new Todo("Learn Spring MVC"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodo(String todo) {
		todos.add(new Todo(todo));
	}

	public void deleteTodo(String todo) {
		todos.remove(new Todo(todo));
	}
}