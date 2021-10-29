package view;

import controller.SaveButtonAction;
import model.ToDo;
import model.ToDoListModel;
import model.TodoModelListener;

import javax.swing.*;

public class ToDoPanel extends JPanel implements TodoModelListener {
    private final String ADD_TOTO = "Save";
    private JTextField title;
    private JButton saveButton;

    //private JLabel label = new JLabel();

    private JTable todoTable;

    ToDoListModel model;

    public ToDoPanel(ToDoListModel model) {
        this.model = model;

        title = new JTextField();
        saveButton = new JButton(ADD_TOTO);
        saveButton.addActionListener(new SaveButtonAction(model, this));
        todoTable = new JTable(new TodoTableModel(model));

        model.addListener(this);

        add(title);
        add(saveButton);
        add(todoTable);
        //add(label);

    }

    public JTextField getTitleTextField() {
        return title;
    }

    @Override
    public void todoListUpdated() {

    }
}
