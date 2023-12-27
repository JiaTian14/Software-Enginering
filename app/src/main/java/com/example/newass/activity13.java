package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class activity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity13);

    Handler handler = new Handler();
        long delayMillis = 200;
        handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(activity13.this, MainActivity.class));
            finish();
            }
        },delayMillis);



    }
}