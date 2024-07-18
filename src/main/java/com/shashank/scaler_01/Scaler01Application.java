package com.shashank.scaler_01;

import com.shashank.scaler_01.greetings.Greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.shashank.scaler_01.http.Client;

import java.util.Arrays;

@SpringBootApplication
public class Scaler01Application {

    public static void main(String[] args) {
//        System.out.println("Argument passed is: " + Arrays.toString(args));
//
//        switch (args[0]) {
//            case "greet":
//                Greetings greet = new Greetings();
//                greet.greet();
//                break;
//            case "http":
//                Client client = new Client();
//                String response = client.get("https://square.github.io/okhttp/");
//                System.out.println(response);
//                break;
//
//            default:
//                System.out.println("Default");
//        }


        System.out.println("Hello World");
		SpringApplication.run(Scaler01Application.class, args);
    }

}
