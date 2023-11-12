package com.example.zadanie3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static TaskStorage taskStorage = new TaskStorage();
    private List<Task> tasks;
    public static TaskStorage getInstance() {
        return taskStorage;
    }
    private TaskStorage() {
        tasks = new ArrayList<Task>(150);
        for (int i = 1; i <= 150; i++) {
            Task task = new Task();
            if (i % 3 == 0) {
                task.setCategory(Category.STUDIA);
            }
            else {
                task.setCategory(Category.DOM);
            }
            task.setName("Zadanie numer " + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public Task getTask(UUID id) {
        for(Task task : tasks) {
            if(task.getId().equals(id))
                return task;
        }
        return null;
    }
}
