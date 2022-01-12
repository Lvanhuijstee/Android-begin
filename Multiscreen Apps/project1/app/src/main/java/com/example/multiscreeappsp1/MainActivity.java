package com.example.multiscreeappsp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView info;
    View tint;
    Button informatie;
    Button informaite2;
    Button secondPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = findViewById(R.id.info);
        tint = findViewById(R.id.tint);
        informatie = findViewById(R.id.informatie);
        informaite2 = findViewById(R.id.informatie2);
        secondPage = findViewById(R.id.secondPage);
    }

    public void informatie(View view) {
        info.setVisibility(View.VISIBLE);
        tint.setVisibility(View.VISIBLE);
        informaite2.setVisibility(View.VISIBLE);
        informatie.setVisibility(View.GONE);
        secondPage.setVisibility(View.GONE);
    }

    public void sluiten(View view) {
        info.setVisibility(View.GONE);
        tint.setVisibility(View.GONE);
        informaite2.setVisibility(View.GONE);
        informatie.setVisibility(View.VISIBLE);
        secondPage.setVisibility(View.VISIBLE);
    }

    public void secondPage(View view) {
        Intent secondPage = new Intent(this,MainActivity2.class);
        startActivity(secondPage);
    }

    public void home2(View view) {
        Intent Gohome2 = new Intent(this, MainActivity4.class);
        startActivity(Gohome2);
    }
}