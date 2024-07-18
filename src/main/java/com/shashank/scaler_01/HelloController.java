package com.shashank.scaler_01;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController{

    @RequestMapping("/world")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/you")
    public String helloYou(@RequestParam("name") String name){
        return "hello"+name;
    }


}
