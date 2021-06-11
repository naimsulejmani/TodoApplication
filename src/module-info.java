module TodoApplication {
    requires java.base;
    requires javafx.controls;
    requires javafx.fxml;


    opens login;
    opens mainform;
}