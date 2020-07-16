package com.industrialmaster.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void next(View v){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
    public void next1(View v){

        Intent intent = new Intent(this,SeventhActivity.class);
        startActivity(intent);

    }
    public void next2(View v){

        Intent intent = new Intent(this,EightActivity.class);
        startActivity(intent);

    }
}
