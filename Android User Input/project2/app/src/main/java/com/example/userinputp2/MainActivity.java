package com.example.userinputp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    CheckBox CB;
    CheckBox CB1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CB = findViewById(R.id.BOX);
        CB1 = findViewById(R.id.box1);
    }
    public void bad(View view) {
    }
    public void iets(View view){
    }

    public void bruh(View view){

        if(CB.isChecked() == true){
            TextView sup = findViewById(R.id.sup);
            sup.setVisibility(View.VISIBLE);
            TextView XD = findViewById(R.id.XD);
            XD.setVisibility(View.GONE);

        }
        if(CB1.isChecked() == true){
            TextView sup = findViewById(R.id.sup);
            sup.setVisibility(View.GONE);
            TextView XD = findViewById(R.id.XD);
            XD.setVisibility(View.VISIBLE);
        }



}



}



