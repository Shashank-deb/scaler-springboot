package com.shashank.scaler_01.task;



import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TestController {

    private List<Task> taskList=new ArrayList<>();

    private int nextTaskId=1;



    @GetMapping("")
    public List<Task> getAllTasks(){
        return taskList;
    }

    @PostMapping("")
    public Task createTask(@RequestBody Task task){
        task.setId(nextTaskId++);
        taskList.add(task);
        return task;
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") Integer id){
        Optional<Task> foundTask=taskList.stream().filter(task->task.getId()==id).findFirst();
        return foundTask.orElse(null);
    }





}


