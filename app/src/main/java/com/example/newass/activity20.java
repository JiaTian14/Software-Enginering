package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity20 extends AppCompatActivity {
public  Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity20);


        button = (Button) findViewById(R.id.Addnow1);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity20.this, activity6.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.ViewNow);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity20.this, activity23.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.Back);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity20.this, activity19.class);
                startActivity(intent);
            }
        });
    }
}