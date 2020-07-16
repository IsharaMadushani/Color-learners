package com.industrialmaster.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void purple(View v){

        Intent intent = new Intent(this,NineActivity.class);
        startActivity(intent);

    }
    public void white(View v){

        Intent intent = new Intent(this,TenActivity.class);
        startActivity(intent);

    }
    public void orange(View v){

        Intent intent = new Intent(this,ElevenActivity.class);
        startActivity(intent);

    }
    public void black(View v){

        Intent intent = new Intent(this,TweleActivity.class);
        startActivity(intent);

    }
    public void brown(View v){

        Intent intent = new Intent(this,ThirteenActivity.class);
        startActivity(intent);

    }
    public void back(View v){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
