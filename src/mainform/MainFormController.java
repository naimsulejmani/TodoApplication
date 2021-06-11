package mainform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import managers.TodoManager;
import models.TodoItem;
import models.UserSession;

import java.io.IOException;

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

    public void showTodoItemDialog(ActionEvent event) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("New TodoItem");
        dialog.setHeaderText("Ju lutem te plotesoni te gjithe te dhenat per todo!!!");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("add_todoitem_dialog.fxml"));

        try {
            dialog.getDialogPane().setContent(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        dialog.showAndWait();

    }
}
