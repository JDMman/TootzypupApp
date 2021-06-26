package com.example.tootzypup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class doofs extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doofs);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int12 = new Intent(doofs.this, Doggg.class);
                startActivity(int12);
            }

        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int13 = new Intent(doofs.this, Cattt.class);
                startActivity(int13);
            }

        });
    }



    @Override
    public void onClick(View v) {

    }
}