package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity2 extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);


        button = (Button) findViewById(R.id.BreakfastButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity2.this, activity3. class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.LunchButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity2.this, activity4. class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.DinnerButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity2.this, activity5. class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.Back);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity2.this,MainActivity. class);
                startActivity(intent);
            }
        });
    }
}