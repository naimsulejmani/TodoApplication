package mainform;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import models.TodoItem;

import java.time.LocalDate;

public class AddTodoItemController {
    @FXML
    private TextField txtShortDescription;

    @FXML
    private TextArea txtAreaDetail;

    @FXML
    private DatePicker dpDeadlineDate;

    @FXML
    private ColorPicker colorPicker;

    public TodoItem getTodoItem() {
        String shortDesc = txtShortDescription.getText();
        String details = txtAreaDetail.getText();
        LocalDate deadline = dpDeadlineDate.getValue();
        Color color = colorPicker.getValue();
        return new TodoItem(shortDesc, details, deadline, color);
    }
}
