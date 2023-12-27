package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity6 extends AppCompatActivity {
public Button button;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity6);

        button = (Button) findViewById(R.id.IndoorButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity6.this, activity6. class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.Outdoor);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity6.this, activity7. class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.Back);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity6.this, activity2. class);
                startActivity(intent);
            }
        });
        ImageButton imageButtonNext = findViewById(R.id.imageButton1);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity6.this, MainActivity.class));
            }
        });

        imageButtonNext = findViewById(R.id.imageButton2);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity6.this, MainActivity.class));
            }
        });
        imageButtonNext = findViewById(R.id.imageButton3);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity6.this, MainActivity.class));
            }
        });

        imageButtonNext = findViewById(R.id.imageButton4);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity6.this, MainActivity.class));
            }
        });

        imageButtonNext = findViewById(R.id.imageButton5);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity6.this, MainActivity.class));
            }
        });

        imageButtonNext = findViewById(R.id.imageButton6);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity6.this, MainActivity.class));
            }
        });
        imageButtonNext = findViewById(R.id.imageButton7);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity6.this, MainActivity.class));
            }
        });
        imageButtonNext = findViewById(R.id.imageButton8);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity6.this, MainActivity.class));
            }
        });
    }
}