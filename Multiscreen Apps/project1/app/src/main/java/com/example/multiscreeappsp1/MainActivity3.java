package com.example.multiscreeappsp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button previous1;
    Button info3;
    Button home1;
    Button next1;
    Button sluiten1;
    TextView funforest;
    View tab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        previous1 = findViewById(R.id.previous1);
        info3 = findViewById(R.id.info3);
        home1 = findViewById(R.id.home1);
        sluiten1 = findViewById(R.id.sluiten1);
        funforest = findViewById(R.id.funForest);
        tab1 = findViewById(R.id.tab1);

    }



    public void back(View view) {
        Intent previous = new Intent(this,MainActivity2.class);
        startActivity(previous);
    }

    public void open1(View view) {
        home1.setVisibility(View.GONE);
        info3.setVisibility(View.GONE);
        previous1.setVisibility(View.GONE);
        sluiten1.setVisibility(View.VISIBLE);
        tab1.setVisibility(View.VISIBLE);
        funforest.setVisibility(View.VISIBLE);
    }

    public void sluiten1(View view) {
        home1.setVisibility(View.VISIBLE);
        info3.setVisibility(View.VISIBLE);
        previous1.setVisibility(View.VISIBLE);
        sluiten1.setVisibility(View.GONE);
        tab1.setVisibility(View.GONE);
        funforest.setVisibility(View.GONE);
    }

    public void home1(View view) {
        Intent GoHome1 = new Intent(this,MainActivity4.class);
        startActivity(GoHome1);
    }
}

