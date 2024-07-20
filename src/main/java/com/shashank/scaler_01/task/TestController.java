package com.shashank.scaler_01.task;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
public class TestController {

   private final TaskService taskService;
    public TestController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("")
    public ResponseEntity<List<Task>> getAllTasks(){
        var tasks=taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }



    @PostMapping("")
    public ResponseEntity <Task> createTask(@RequestBody Task task){
        var createdTask=taskService.createTask(task);
        return ResponseEntity.ok(createdTask);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Integer id){
        var task=taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    //Todo 1: implement Update Task- PATCH
    //Todo 2: implement Delete Task - DELETE
    //Todo 3:  handle exception for IllegalArgumentException (due date,name)
    //Todo 4:  in error response, also send the error messages in the response body
    //Todo 5:  create a ResponseBodyDTO -only return name,dueDate,completed

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Integer id, @RequestBody Task task){
        var updatedTask=taskService.updateTask(id,task.getDueDate(),task.getCompleted());
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Integer id){
        taskService.deleteTask(id);
        return ResponseEntity.ok().build();
    }



    @ExceptionHandler(TaskService.TaskNotFoundException.class)
    public ResponseEntity<String> handleTaskNotFoundException(TaskService.TaskNotFoundException e){
        return ResponseEntity.notFound().build();
    }



    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleIllegalArgumentException(IllegalArgumentException e) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", e.getMessage());
        return ResponseEntity.badRequest().body(errorResponse);
    }






}


