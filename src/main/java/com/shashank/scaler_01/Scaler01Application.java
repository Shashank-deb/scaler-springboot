package com.shashank.scaler_01;
import com.shashank.scaler_01.greetings.Greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.shashank.scaler_01.http.Client;
@SpringBootApplication
public class Scaler01Application {

	public static void main(String[] args) {
		Greetings greet=new Greetings();
		greet.greet();

		Client client=new Client();
		String response=client.get("https://square.github.io/okhttp/");
		System.out.println(response);
		SpringApplication.run(Scaler01Application.class, args);
	}

}
