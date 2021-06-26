package com.example.tootzypup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interface extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);

        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent (Interface.this,Dog.class);
                startActivity(int1);
            }

        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent (Interface.this,Cat.class);
                startActivity(int3);
            }

        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent (Interface.this,doofs.class);
                startActivity(int5);
            }

        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int6 = new Intent (Interface.this,Vet.class);
                startActivity(int6);
            }

        });

    }

    @Override
    public void onClick(View v) {

    }
}