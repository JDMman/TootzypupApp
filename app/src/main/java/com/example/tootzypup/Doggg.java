package com.example.tootzypup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Doggg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doggg);
    }
    public void btnreg(View view) {
        Intent start = new Intent(this, Dogggg.class);
        startActivity(start);
    }
}