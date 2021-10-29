package model;

import java.util.ArrayList;
import java.util.List;

public class ToDoListModel {
    private List<ToDo> todoList = new ArrayList<>();
    private List<TodoModelListener> listeners = new ArrayList<>();


    public void addListener(TodoModelListener listener) {
        listeners.add(listener);
    }


    private void notifyListeners() {
        for(TodoModelListener listener : listeners) {
            listener.todoListUpdated();
        }
    }


    public void addTodo(ToDo todo) {
        todoList.add(todo);
        notifyListeners();
    }

    public void removeTodo(ToDo todo) {
        todoList.remove(todo);
        notifyListeners();
    }

    public int getRemaingTodoCount() {
        return todoList.size();
    }

    public List<ToDo> getTodoList() {
        return todoList;
    }

}
