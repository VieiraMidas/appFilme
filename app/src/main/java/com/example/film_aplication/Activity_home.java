package com.example.film_aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activity_home extends AppCompatActivity {

    String server_url = "http://192.168.0.7/projetovolleyapi/totoro.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);
    }
}