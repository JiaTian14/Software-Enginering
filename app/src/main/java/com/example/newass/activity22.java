package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
public class activity22 extends AppCompatActivity {
public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity22);

        ImageButton imageButtonNext = findViewById(R.id.SettingButton);
        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the NextActivity when the ImageButton is clicked
                startActivity(new Intent(activity22.this, activity19.class));
            }
        });

        button = (Button) findViewById(R.id.Review);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity22.this, activity14.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.CancelEdit);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity22.this, activity16.class);
                startActivity(intent);
            }
        });
    }
}