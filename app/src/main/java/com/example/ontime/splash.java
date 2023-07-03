package com.example.ontime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent iList = new Intent(splash.this, Selectcity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iList);
                finish();
            }
        },4000);
    }
}