package view;

import controller.KeyPressListener;
import controller.SaveButtonAction;
import model.ToDoListModel;
import model.TodoModelListener;

import javax.swing.*;
import java.awt.*;

public class ToDoPanel extends JPanel implements TodoModelListener {
    private final String ADD_TOTO = "Save";
    private final JTextField todoItemTextField;
    private final JButton saveButton;
    private final JTable todoListTable;

    private final ToDoListModel model;

    public ToDoPanel(ToDoListModel model) {
        this.model = model;

        todoItemTextField = new JTextField();
        todoItemTextField.setPreferredSize(new Dimension(600, 50));
        saveButton = new JButton(ADD_TOTO);
        //saveButton.setPreferredSize(new Dimension(400,50));
        saveButton.addActionListener(new SaveButtonAction(model, this));

        todoListTable = new JTable(new TodoTableModel(model));
        todoListTable.setPreferredScrollableViewportSize(new Dimension(600, 500));
        JScrollPane scrollPane = new JScrollPane(todoListTable);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        model.addListener(this);
        todoItemTextField.addKeyListener(new KeyPressListener(model, this));

        add(todoItemTextField);
        add(saveButton);
        add(scrollPane);

    }

    public JTextField getTitleTextField() {
        return todoItemTextField;
    }

    @Override
    public void todoListUpdated() {

    }
}
