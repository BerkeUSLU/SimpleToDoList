package controller;

import model.ToDo;
import model.ToDoListModel;
import view.ToDoPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressListener implements KeyListener {
    private ToDoListModel model;
    private ToDoPanel view;

    public KeyPressListener(ToDoListModel model, ToDoPanel view) {
        this.model = model;
        this.view = view;

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String title = view.getTitleTextField().getText();
            if(title.isEmpty()) {
                return;
            }
            ToDo td = new ToDo(title);
            model.addTodo(td);

            view.getTitleTextField().setText("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}