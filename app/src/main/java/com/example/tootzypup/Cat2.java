package com.example.tootzypup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cat2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat2);
    }
    public void btnreg(View view) {
        Intent start = new Intent(this, Cat3.class);
        startActivity(start);
    }
}