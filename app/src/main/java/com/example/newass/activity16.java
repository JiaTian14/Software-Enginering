package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity16 extends AppCompatActivity {
public Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity16);

        button = (Button) findViewById(R.id.Edit2);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity16.this, activity2.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Back);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity16.this, activity22.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Cancel);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity16.this, activity17. class);
                startActivity(intent);
            }
        });

    }
}