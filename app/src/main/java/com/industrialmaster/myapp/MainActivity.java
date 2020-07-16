package com.industrialmaster.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View v) {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

    public void Red(View v) {

        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void Green(View v) {

        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void Yellow(View v) {

        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    public void Blue(View v) {

        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }
}