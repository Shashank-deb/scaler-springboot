package com.shashank.scaler_01.greetings;

public class Greetings {

    /*
    * write a function which prints the appropriate greeting message based on the time
    * */


    public static void greet(){
        int hour=java.time.LocalTime.now().getHour();
        if(hour>=0 && hour<12){
            System.out.println("Good Morning");
        }
        else if(hour>=12 && hour<16){
            System.out.println("Good Afternoon");
        }
        else if(hour>=16 && hour<20){
            System.out.println("Good Evening");
        }
        else{
            System.out.println("Good night");
        }
    }
}
