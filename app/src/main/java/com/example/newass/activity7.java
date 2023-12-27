package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity7 extends AppCompatActivity {
public Button button;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7);
        button = (Button) findViewById(R.id.IndoorButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity7.this, activity6. class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.OutdoorButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity7.this, activity7. class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.Back);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity7.this, activity2. class);
                startActivity(intent);
            }
        });

        View imageButtonNext = findViewById(R.id.imageButton1);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity7.this, MainActivity.class));
            }
        });

        imageButtonNext = findViewById(R.id.imageButton2);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity7.this, MainActivity.class));
            }
        });
        imageButtonNext = findViewById(R.id.imageButton3);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity7.this, MainActivity.class));
            }
        });

        imageButtonNext = findViewById(R.id.imageButton4);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity7.this, MainActivity.class));
            }
        });

        imageButtonNext = findViewById(R.id.imageButton5);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity7.this, MainActivity.class));
            }
        });

    }
}