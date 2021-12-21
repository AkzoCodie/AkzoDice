package com.example.akzodice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class HomeScreen extends AppCompatActivity {
    Timer timerToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        timerToMain = new Timer();
        timerToMain.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}