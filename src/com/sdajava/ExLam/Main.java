package com.sdajava.ExLam;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public enum TaskType {
        READING;
    }

    public static void main(String[] args) {

        List<Task> tasks = getTask();
        List<String> titles = taskTitles(tasks);
        for (String title : titles)
            System.out.println(title);
    }
/*
    public static List<String> taskTitles(List<Task> tasks) {
        List<String> readingTitles = new ArrayList<>();
        for (Task task: tasks) {
            if (task.getType() == TaskType.READING)
                readingTitles.add(task.getTitle());
        }
        return readingTitles;
    }

*/
    public static List<Task> getTask() {
        List<Task> ts = new ArrayList<>();
        ts.add(new Task("z dupy wzięte", "1", TaskType.READING));
        ts.add(new Task("z py wzięte", "2", TaskType.READING));
        ts.add(new Task("z  wzięte", "3", TaskType.READING));
        ts.add(new Task("zięte", "4", TaskType.READING));

        return ts;
    }

    public static List<String> taskTitles(List<Task> tasks) {
        List<String> st = new ArrayList<>();
        for (Task ts : tasks) {
            st.add(ts.getTitle());
        }
        return st;
    }
}
