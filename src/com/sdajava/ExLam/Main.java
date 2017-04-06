package com.sdajava.ExLam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Task> tasks = getTask();
        List<String> titles = taskTitles(tasks);
        for (String title : titles)
            System.out.println(title);
    }

    public static List<String> taskTitles(List<Task> tasks) {

        return tasks.stream()
                .filter(p -> p.getType() == TaskType.READING)
                .map(p -> p.getTitle())
                .collect(Collectors.toList());
    }


    public static List<Task> getTask() {
        //List<Task> ts = new ArrayList<>();
        Task task1 = new Task("1", "title1", TaskType.READING);
        Task task2 = new Task("2", "title2", TaskType.WRITING);
        Task task3 = new Task("3", "title3", TaskType.READING);
        Task task4 = new Task("4", "title4", TaskType.WRITING);

        return Stream.of(task1, task2, task3, task4).collect(Collectors.toList());
    }
}
