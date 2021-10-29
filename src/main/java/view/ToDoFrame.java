package view;

import model.ToDoListModel;

import javax.swing.*;

public class ToDoFrame extends JFrame {
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private final String APP_NAME = "To Do List V1.0";

    private ToDoListModel toDoListModel;


    public ToDoFrame(ToDoListModel model) {
        toDoListModel = model;

        setTitle(APP_NAME);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ToDoPanel panel = new ToDoPanel(toDoListModel);
        add(panel);
        setVisible(true);
    }
}
