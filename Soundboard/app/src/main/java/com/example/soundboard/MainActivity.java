package com.example.soundboard;

import android.arch.lifecycle.LiveData;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import java.util.List;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {

    //creating mediaplayers
    MediaPlayer bow;
    MediaPlayer fart;
    MediaPlayer mp5;
    MediaPlayer sweep;
    //crasher appen
    /*
    final TextView bowText = findViewById(R.id.textView);
    final TextView fartText = findViewById(R.id.textView2);
    final TextView mp5Text = findViewById(R.id.textView4);
    final TextView sweepText = findViewById(R.id.textView3);
    */
    int sweepAmount, fartAmount, mp5Amount, bowAmount;
    Sound bowS = new Sound();
    Sound fartS = new Sound();
    Sound mp5S = new Sound();
    Sound sweepS = new Sound();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating sounds from files
        bow = MediaPlayer.create(this, R.raw.bow);
        fart = MediaPlayer.create(this, R.raw.fart);
        mp5 = MediaPlayer.create(this, R.raw.mp5);
        sweep = MediaPlayer.create(this, R.raw.sweep);


        SoundRepository sdb = new SoundRepository(getApplicationContext());

        bowS = sdb.getSound("bow");
        fartS = sdb.getSound("fart");
        mp5S = sdb.getSound("mp5");
        sweepS = sdb.getSound("sweep");

        if(bowS != null){
            bowAmount = bowS.getAmount();
        }
        if(fartS != null){
            fartAmount = fartS.getAmount();
        }
        if(mp5S != null){
            mp5Amount = mp5S.getAmount();
        }
        if(sweepS != null){
            sweepAmount = sweepS.getAmount();
        }
        /*
        bowText.setText(bowAmount);
        fartText.setText(fartAmount);
        mp5Text.setText(mp5Amount);
        sweepText.setText(sweepAmount);
        */
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
