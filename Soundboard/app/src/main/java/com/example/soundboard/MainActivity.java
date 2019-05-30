package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //creating mediaplayers
    MediaPlayer bow;
    MediaPlayer fart;
    MediaPlayer mp5;
    MediaPlayer sweep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating sounds from files
        bow = MediaPlayer.create(this, R.raw.bow);
        fart = MediaPlayer.create(this, R.raw.fart);
        mp5 = MediaPlayer.create(this, R.raw.mp5);
        sweep = MediaPlayer.create(this, R.raw.sweep);



    }
    //start sound with button
    public void bow(View view){
        bow.start();
    }
    //start sound with button
    public void fart(View view){
        fart.start();
    }
    //start sound with button
    public void mp5(View view){
        mp5.start();
    }
    //start sound with button
    public void sweep(View view){
        sweep.start();
    }
}
