package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity9 extends AppCompatActivity {
public Button button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        button = (Button) findViewById(R.id.LoginAccountButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity9.this, activity8. class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.SignUpButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity9.this, activity8. class);
                startActivity(intent);
            }
        });


    }
}