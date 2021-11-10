package com.example.androiduserinputp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int numberB = 0;
    int numberR =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus(View view) {
        display(1);
        numberB ++;

    }

    private void display(int i) {
        Button quanttityButton =findViewById(R.id.knopblue);
        quanttityButton.setText(""+ numberB );
    }

    public void plusR(View view) {
        displayR(1);
        numberR++;

    }

    private void displayR(int i) {
        Button count =findViewById(R.id.knopred);
                count.setText("" + numberR);
    }


    public void zero(View view) {
        numberR = 0;
        numberB = 0;
    }
}

