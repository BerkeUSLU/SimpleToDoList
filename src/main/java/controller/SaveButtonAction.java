package controller;

import model.ToDo;
import model.ToDoListModel;
import view.ToDoFrame;
import view.ToDoPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveButtonAction extends AbstractAction {
    private ToDoListModel model;
    private ToDoPanel view;

    public SaveButtonAction(ToDoListModel model, ToDoPanel view) {
        this.model = model;
        this.view = view;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String title = view.getTitleTextField().getText();
        if(title.isEmpty()) {
            return;
        }

        ToDo td = new ToDo(title);
        model.addTodo(td);

        view.getTitleTextField().setText("");
    }
}
