package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("hey");        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        OkHttpClient client = new OkHttpClient();
        String url= "https://fakestoreapi.com/products";
        Request request= new Request.Builder()
                .url(url)
                .build();
        try(Response response= client.newCall(request).execute()){
            System.out.println(response.body().string());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}