package view;

import model.ToDoListModel;
import model.TodoModelListener;

import javax.swing.table.AbstractTableModel;

public class TodoTableModel extends AbstractTableModel implements TodoModelListener {
    private ToDoListModel model;
    public TodoTableModel(ToDoListModel model) {
        this.model = model;
        this.model.addListener(this);
    }

    @Override
    public int getRowCount() {
        return model.getRemaingTodoCount();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return model.getTodoList().get(rowIndex).getTitle();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return "Title";
    }

    @Override
    public void todoListUpdated() {
        fireTableDataChanged();
    }
}
