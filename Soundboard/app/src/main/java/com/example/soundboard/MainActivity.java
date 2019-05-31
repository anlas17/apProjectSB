package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {

    //creating mediaplayers
    MediaPlayer bow;
    MediaPlayer fart;
    MediaPlayer mp5;
    MediaPlayer sweep;

    final TextView bowText = (TextView) findViewById(R.id.textView);
    final TextView fartText = (TextView) findViewById(R.id.textView2);
    final TextView mp5Text = (TextView) findViewById(R.id.textView4);
    final TextView sweepText = (TextView) findViewById(R.id.textView3);

    int sweepAmount, fartAmount, mp5Amount, bowAmount;

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
        List<Sound> soundlist = sdb.getSounds();

        for(int i=0;i<soundlist.size();i++){
            if(soundlist.get(i).getName() == "bow"){
                bowAmount = soundlist.get(i).getAmount();
            }
            if(soundlist.get(i).getName() == "fart"){
                fartAmount = soundlist.get(i).getAmount();
            }
            if(soundlist.get(i).getName() == "mp5"){
                mp5Amount = soundlist.get(i).getAmount();
            }
            if(soundlist.get(i).getName() == "sweep"){
                sweepAmount = soundlist.get(i).getAmount();
            }
        }


        bowText.setText(bowAmount);
        fartText.setText(fartAmount);
        mp5Text.setText(mp5Amount);
        sweepText.setText(sweepAmount);
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
