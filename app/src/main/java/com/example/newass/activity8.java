package com.example.newass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity8 extends AppCompatActivity {
public Button button;
private Button buttonShowDialog;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity8);

        button = (Button) findViewById(R.id.LoginButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity8.this, activity13. class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.CreateButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity8.this, activity9. class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.ForgetButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity8.this, activity10. class);
                startActivity(intent);
            }
        });



    }
}


