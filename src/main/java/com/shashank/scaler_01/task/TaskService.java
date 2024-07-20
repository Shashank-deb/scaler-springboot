package com.shashank.scaler_01.task;

import com.shashank.scaler_01.dtos.ResponseBodyDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class TaskService {

    List<Task> taskList = new ArrayList<>();

    private int nextTaskId = 0;

    public List<Task> getAllTasks() {
        return taskList;
    }

    public Task getTaskById(int id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        throw new TaskNotFoundException(id);
    }

    public Task createTask(Task task) {
        task.setId(++nextTaskId);
        taskList.add(task);
        return task;
    }

    public Task updateTask(Integer id, Date dueDate, Boolean completed) {
        Task task = getTaskById(id);
        if (dueDate != null) {
            task.setDueDate(dueDate);
        }
        if (completed != null) {
            task.setCompleted(completed);
        }
        return task;

    }

    public void deleteTask(Integer id) {
        Task task = getTaskById(id);
        taskList.remove(task);
    }


    public ResponseBodyDTO toResponseBodyDTO(Task task) {
        ResponseBodyDTO dto = new ResponseBodyDTO();
        dto.setName(task.getName());
        dto.setDueDate(task.getDueDate());
        dto.setCompleted(task.getCompleted());
        return dto;
    }

    /*Create a class who have handle the exception extending with IllegalArgumentException*/

    public static class TaskNotFoundException extends IllegalStateException{

        public TaskNotFoundException(Integer id) {
            super("Task with id: "+id+" not found");
        }
    }


}
