package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity19 extends AppCompatActivity {
public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity19);

        button = (Button) findViewById(R.id.FavouriteButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity19.this, activity20.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.ContactButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity19.this, activity21.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Back);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity19.this, activity22. class);
                startActivity(intent);
            }
        });
    }
}