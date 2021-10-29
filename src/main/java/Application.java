import com.formdev.flatlaf.FlatDarculaLaf;
import model.ToDoListModel;
import view.ToDoFrame;

public class Application {
    public static void main(String[] args) {
        FlatDarculaLaf.install();
        ToDoListModel model = new ToDoListModel();
        ToDoFrame toDoFrame = new ToDoFrame(model);
    }
}
