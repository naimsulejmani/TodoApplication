package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    public void login(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (username.isEmpty() || username.isBlank()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Missing information");
            alert.setContentText("Username is not specified!!!");
            alert.show();
            return;
        }

        if (password.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Missing information");
            alert.setContentText("Password is not specified!!!");
            alert.show();
            return;
        }

        if (username.equals(password)) {
            Node source = (Node) event.getSource();
            source.getScene().getWindow().hide();
            loadMainForm("/mainform/mainform.fxml", "Main Todo Application Form");
            //ne rregull
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Not authorized");
            alert.setContentText("Username or password is wrong!!!");
            alert.show();
            return;
        }
    }

    private void loadMainForm(String location, String title) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(location));
            Scene mainScene = new Scene(root);
            Stage mainStage = new Stage(StageStyle.DECORATED);
            mainStage.setScene(mainScene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
