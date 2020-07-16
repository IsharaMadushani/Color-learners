package com.industrialmaster.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);
    }
    public void back(View v){

        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);

    }
    public void next1(View v){

        Intent intent = new Intent(this,FourteenActivity.class);
        startActivity(intent);

    }
    public void next2(View v){

        Intent intent = new Intent(this,FifteenActivity.class);
        startActivity(intent);

    }
}
