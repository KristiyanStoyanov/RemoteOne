package com.feistymoon.tasklist;

import java.util.Date;

/**
 * Created by kathy on 23/08/2015.
 */
public class Task {

    private String taskName = null;
    private String taskDescription = null;
    // auto set to false
    boolean isComplete = false;
    Date dueDate = null;

    // Not all logic is implemented here
    public Task(String taskName, String taskDescription, Date dueDate){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
    }

    public String getTaskName(){
        return taskName;
    }

    public String getTaskDescription(){
        return taskDescription;
    }

    public Date getDueDate(){
        return dueDate;
    }
}
