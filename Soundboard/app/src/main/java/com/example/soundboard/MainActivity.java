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
    //crasher appen
    /*
    final TextView bowText = findViewById(R.id.textView);
    final TextView fartText = findViewById(R.id.textView2);
    final TextView mp5Text = findViewById(R.id.textView4);
    final TextView sweepText = findViewById(R.id.textView3);
    */

    Integer bowAmount = new Integer(0);
    Integer sweepAmount = new Integer(0);
    Integer fartAmount = new Integer(0);
    Integer mp5Amount = new Integer(0);

    Sound fartS = new Sound("fart", 0);
    Sound mp5S = new Sound("mp5", 0);
    Sound sweepS = new Sound("sweep", 0);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SoundRepository sdb = new SoundRepository(getApplicationContext());

        //creating sounds from files
        bow = MediaPlayer.create(this, R.raw.bow);
        fart = MediaPlayer.create(this, R.raw.fart);
        mp5 = MediaPlayer.create(this, R.raw.mp5);
        sweep = MediaPlayer.create(this, R.raw.sweep);


        //set text to 0 placeholder
        /*
        bowText.setText(bowAmount);
        fartText.setText(fartAmount);
        mp5Text.setText(mp5Amount);
        sweepText.setText(sweepAmount);
        */
    }


    //start sound with button
    public void bow(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        bow.start();
        Sound bowS = new Sound("bow",0);

        try {
            bowS = sdb.getSound("bow");
            bowAmount = bowS.getAmount() + 1;
            //set text bowamount
            bowS.setAmount(bowAmount);
            sdb.updateSound(bowS.getName(), bowS.getAmount());
        }catch(Exception e){
            //set text bowamount to 0
            sdb.insertSound("bow",0);
        }

    }
    //start sound with button
    public void fart(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        fart.start();
        Sound fartS = new Sound("fart",0);

        try {
            fartS = sdb.getSound("fart");
            fartAmount = fartS.getAmount() + 1;
            //set text bowamount
            fartS.setAmount(fartAmount);
            sdb.updateSound(fartS.getName(), fartS.getAmount());
        }catch(Exception e){
            //set text fartamount to 0
            sdb.insertSound("fart",0);
        }
    }
    //start sound with button
    public void mp5(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        mp5.start();
        Sound mp5S = new Sound("mp5",0);

        try {
            mp5S = sdb.getSound("mp5");
            mp5Amount = mp5S.getAmount() + 1;
            //set text mp5amount
            mp5S.setAmount(mp5Amount);
            sdb.updateSound(mp5S.getName(), mp5S.getAmount());
        }catch(Exception e){
            //set text mp5amount to 0
            sdb.insertSound("mp5",0);
        }
    }
    //start sound with button
    public void sweep(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        sweep.start();
        Sound sweepS = new Sound("sweep",0);

        try {
            sweepS = sdb.getSound("sweep");
            sweepAmount = sweepS.getAmount() + 1;
            //set text sweepamount
            sweepS.setAmount(sweepAmount);
            sdb.updateSound(sweepS.getName(), sweepS.getAmount());
        }catch(Exception e){
            //set text sweepamount to 0
            sdb.insertSound("sweep",0);
        }
    }
}
