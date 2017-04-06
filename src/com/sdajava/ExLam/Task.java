package com.sdajava.ExLam;

import java.util.List;
import com.sdajava.ExLam.Main;

public class Task {

    private String title;
    private String id;
    private TaskType type;

    public Task(String title, String id, TaskType type) {
        this.title = title;
        this.id = id;
        this.type = type;
    }

    public Task(String title, String id, Main.TaskType reading) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }
}
