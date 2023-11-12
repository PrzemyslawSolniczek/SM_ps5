package com.example.zadanie3;

import android.widget.CheckBox;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    private Category category;
    private CheckBox checkBox;
    public Task() {
        id = UUID.randomUUID();
        date = new Date();
        category = Category.STUDIA;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {this.date = date;}
    public boolean isDone() {
        return done;
    }
    public String getName() {
        return name;
    }
    public UUID getId() {
        return id;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }


}
