package mainform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import models.UserSession;

public class MainFormController {

    @FXML
    private Label currentUser;

    public void initialize() {
        currentUser.setText(UserSession.username);
        System.out.println(UserSession.username);
    }
}
