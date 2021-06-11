module TodoApplication {
    requires java.base;
    requires javafx.controls;
    requires javafx.fxml;

    exports models;
    opens login;
    opens mainform;
}