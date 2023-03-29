package com.javaee.bitlab.db;

import com.javaee.bitlab.db.models.Task;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Task> tasks = new ArrayList<>();
    private static  long taskId = 6L;

    static {
        tasks.add(new Task(1L, "sd1","qwe", false, "12345"));
        tasks.add(new Task(2L, "sd2","qwe", false, "12345"));
        tasks.add(new Task(3L, "sd3","qwe", false, "12345"));
        tasks.add(new Task(4L, "sd4","qwe", false, "12345"));
        tasks.add(new Task(5L, "sd5","qwe", false, "12345"));
    }
    public static ArrayList<Task> getTasks(){
        return tasks;
    }

    public static void addTask(Task  task){
        task.setId(taskId);
        tasks.add(task);
        taskId++;
    }
    public static Task getTask(Long id){
        return tasks.stream().filter(task -> task.getId() == id).toList().get(0);
    }
    public static void deleteTask(Long id){
        tasks.remove(tasks.stream().filter(task -> task.getId() == id).toList().get(0));
    }
}
