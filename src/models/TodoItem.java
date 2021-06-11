package models;

import javafx.scene.paint.Color;

import java.time.LocalDate;

public class TodoItem {
    private String shortDescription;
    private String details;
    private LocalDate deadline;
    private Color color;

    public TodoItem() {
    }

    public TodoItem(String shortDescription, String details, LocalDate deadline, Color color) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.deadline = deadline;
        this.color = color;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
