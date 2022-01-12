package com.example.multiscreeappsp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void goFirst(View view) {
        Intent first = new Intent(this,MainActivity.class);
        startActivity(first);
    }
    public void goSecond(View view) {
        Intent second = new Intent(this,MainActivity2.class);
        startActivity(second);
    }
    public void goThird(View view) {
        Intent third = new Intent(this,MainActivity3.class);
        startActivity(third);
    }
}