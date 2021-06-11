package managers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import models.TodoItem;

import java.time.LocalDate;

//singleton
public class TodoManager {
    private static TodoManager instance = new TodoManager();
    private static ObservableList<TodoItem> items;

    public static TodoManager getInstance() {
        return instance;
    }

    private TodoManager() {
        items = FXCollections.observableArrayList();
        TodoItem item1 = new TodoItem("Learn JavaFX", "Its not hard to learn", LocalDate.now(), Color.AQUA);
        TodoItem item2 = new TodoItem("Learn Spring Boot", "Its easy! Mentor will teach us",
                LocalDate.of(2021, 6, 12), Color.GREEN);
        items.addAll(item1, item2);
    }

    public ObservableList<TodoItem> getItems() {
        return items;
    }

    public void add(TodoItem item) {
        items.add(item);
    }

}
