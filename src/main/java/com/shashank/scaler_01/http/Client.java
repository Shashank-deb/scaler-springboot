package com.shashank.scaler_01.http;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class Client {

    OkHttpClient okHttpClient;
    //instance variable for our okhttpClient

    public Client() {
        okHttpClient = new OkHttpClient();
    }





    public String get(String url){
        Request request = new Request.Builder()
                .url(url)
                .build();
        try{
            return okHttpClient.newCall(request).execute().body().string();
        }catch (IOException e){
            System.out.println("Error in get request: "+e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
