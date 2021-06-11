package mainform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import managers.TodoManager;
import models.TodoItem;
import models.UserSession;

public class MainFormController {

    @FXML
    private Label currentUser;

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private TableView table;

    public void initialize() {
        currentUser.setText(UserSession.username);
        System.out.println(UserSession.username);

        TableColumn<TodoItem,String> column1 = new TableColumn<>("Short Description");
        column1.setCellValueFactory(new PropertyValueFactory<>("shortDescription"));

        TableColumn<TodoItem,String> column2 = new TableColumn<>("Todo Details");
        column2.setCellValueFactory(new PropertyValueFactory<>("details"));

        TableColumn<TodoItem,String> column3 = new TableColumn<>("Deadline date");
        column3.setCellValueFactory(new PropertyValueFactory<>("deadline"));

        table.getColumns().addAll(column1,column2,column3);

        table.setItems(TodoManager.getInstance().getItems());
    }
}
