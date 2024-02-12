package com.example.sound_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button redbtn, blackbtn, greenbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redbtn = findViewById(R.id.redbtn);
        blackbtn= findViewById(R.id.blackbtn);
        greenbtn= findViewById(R.id.greenbtn);

        redbtn.setOnClickListener(this);
        blackbtn.setOnClickListener(this);
        greenbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       int clicked = v.getId();

       if(clicked== R.id.redbtn){
           Playsound(R.raw.red);
       }
       else if(clicked==R.id.blackbtn){
           Playsound(R.raw.black);
       }
       else if(clicked== R.id.greenbtn){
           Playsound(R.raw.green);
       }
    }

    public void Playsound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}






