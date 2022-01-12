package com.example.multiscreeappsp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button previous;
    Button info2;
    Button home;
    Button next;
    Button sluiten;
    TextView floriade;
    View tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        previous = findViewById(R.id.previous);
        info2 = findViewById(R.id.info2);
        home = findViewById(R.id.home);
        next =findViewById(R.id.next);
        sluiten = findViewById(R.id.sluiten);
        floriade = findViewById(R.id.floriade);
        tab = findViewById(R.id.tab);

    }



    public void Next(View view) {
        Intent next = new Intent(this,MainActivity3.class);
        startActivity(next);
    }

    public void back(View view) {
        Intent previous = new Intent(this,MainActivity.class);
        startActivity(previous);
    }

    public void open(View view) {
        home.setVisibility(View.GONE);
        info2.setVisibility(View.GONE);
        previous.setVisibility(View.GONE);
        next.setVisibility(View.GONE);
        sluiten.setVisibility(View.VISIBLE);
        tab.setVisibility(View.VISIBLE);
        floriade.setVisibility(View.VISIBLE);
    }

    public void sluiten(View view) {
        home.setVisibility(View.VISIBLE);
        info2.setVisibility(View.VISIBLE);
        previous.setVisibility(View.VISIBLE);
        next.setVisibility(View.VISIBLE);
        sluiten.setVisibility(View.GONE);
        tab.setVisibility(View.GONE);
        floriade.setVisibility(View.GONE);
    }


    public void home(View view) {
        Intent GoHome = new Intent(this,MainActivity4.class);
        startActivity(GoHome);
    }
}