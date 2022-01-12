package com.example.multiscreenappsp2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    int i = 1;
    TextView music;
    Button stopM;
    Button playM;
    Button pauseM;
    MediaPlayer mediaPlayer;
   MediaPlayer mediaPlayer2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music = findViewById(R.id.name);
        pauseM = findViewById(R.id.pause_M);
        playM = findViewById(R.id.play_M);
        mediaPlayer = MediaPlayer.create(this,R.raw.running);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.themesong);
        stopM = findViewById(R.id.stop_M);

    }

    public void min(View view) {
        i --;

        playM.setVisibility(View.VISIBLE);
        pauseM.setVisibility(View.GONE);

        if (i == 0){
            i =2;
        }

        if (i == 1){
            music.setText("Running in the 90's");

            mediaPlayer2.stop();
            mediaPlayer2.prepareAsync();
        }
        else if(i == 2){
            music.setText("Themesong");

            mediaPlayer.stop();
            mediaPlayer.prepareAsync();
        }
    }

    public void plus(View view) {
        i ++;

        playM.setVisibility(View.VISIBLE);
        pauseM.setVisibility(View.GONE);

        if (i == 3){
            i = 1;
        }

        if (i == 1){
            music.setText("running in the 90's");

            mediaPlayer2.stop();
            mediaPlayer2.prepareAsync();
        }
        else if(i == 2){
            music.setText("themesong");

            mediaPlayer.stop();
            mediaPlayer.prepareAsync();
        }
    }

    public void playXD(View view) {
        playM.setVisibility(View.GONE);
        pauseM.setVisibility(View.VISIBLE);


        if(i == 1){

            mediaPlayer.start();
        }
        else if(i == 2){

            mediaPlayer2.start();
        }
    }


    public void stop(View view) {
       playM.setVisibility(View.VISIBLE);
       pauseM.setVisibility(View.GONE);

        if (i == 1) {
           mediaPlayer.stop();
           mediaPlayer.prepareAsync();
       }
       else if(i == 2){
           mediaPlayer2.stop();
           mediaPlayer2.prepareAsync();
       }
    }


    public void pause(View view) {
       pauseM.setVisibility(View.GONE);
       playM.setVisibility(View.VISIBLE);
        if(i == 1){
            mediaPlayer.pause();
        }
        else if(i == 2){
            mediaPlayer2.pause();
        }
    }
}



