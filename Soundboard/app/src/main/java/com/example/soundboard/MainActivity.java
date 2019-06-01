package com.example.soundboard;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer bow;
    private MediaPlayer fart;
    private MediaPlayer mp5;
    private MediaPlayer sweep;

    Integer bowAmount = new Integer(0);
    Integer sweepAmount = new Integer(0);
    Integer fartAmount = new Integer(0);
    Integer mp5Amount = new Integer(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SoundRepository sdb = new SoundRepository(getApplicationContext());

        TextView bowText = (TextView) findViewById(R.id.textbow);
        TextView fartText = (TextView) findViewById(R.id.textfart);
        TextView mp5Text = (TextView) findViewById(R.id.textmp5);
        TextView sweepText = (TextView) findViewById(R.id.textsweep);

        bowText.setText(String.valueOf(bowAmount));
        fartText.setText(String.valueOf(fartAmount));
        mp5Text.setText(String.valueOf(mp5Amount));
        sweepText.setText(String.valueOf(sweepAmount));


    }

    //start sound with button
    public void bow(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        TextView bowText = (TextView) findViewById(R.id.textbow);
        bow = MediaPlayer.create(this, R.raw.bow);

        bow.start();
        Sound bowS;

        try {
            bowS = sdb.getSound("bow");
            bowAmount = bowS.getAmount() + 1;
            bowText.setText(String.valueOf(bowAmount));
            bowS.setAmount(bowAmount);
            sdb.updateSound(bowS.getName(), bowS.getAmount());
        }catch(Exception e){
            bowText.setText(String.valueOf(bowAmount));
            sdb.insertSound("bow",0);
        }

    }
    //start sound with button
    public void fart(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        TextView fartText = (TextView) findViewById(R.id.textfart);
        fart = MediaPlayer.create(this, R.raw.fart);

        fart.start();
        Sound fartS;

        try {
            fartS = sdb.getSound("fart");
            fartAmount = fartS.getAmount() + 1;
            fartText.setText(String.valueOf(fartAmount));
            fartS.setAmount(fartAmount);
            sdb.updateSound(fartS.getName(), fartS.getAmount());
        }catch(Exception e){
            fartText.setText(String.valueOf(fartAmount));
            sdb.insertSound("fart",0);
        }
    }
    //start sound with button
    public void mp5(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        TextView mp5Text = (TextView) findViewById(R.id.textmp5);
        mp5 = MediaPlayer.create(this, R.raw.mp5);

        mp5.start();
        Sound mp5S;

        try {
            mp5S = sdb.getSound("mp5");
            mp5Amount = mp5S.getAmount() + 1;
            mp5Text.setText(String.valueOf(mp5Amount));
            mp5S.setAmount(mp5Amount);
            sdb.updateSound(mp5S.getName(), mp5S.getAmount());
        }catch(Exception e){
            mp5Text.setText(String.valueOf(mp5Amount));
            sdb.insertSound("mp5",0);
        }
    }
    //start sound with button
    public void sweep(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        TextView sweepText = (TextView) findViewById(R.id.textsweep);
        sweep = MediaPlayer.create(this, R.raw.sweep);

        sweep.start();
        Sound sweepS;

        try {
            sweepS = sdb.getSound("sweep");
            sweepAmount = sweepS.getAmount() + 1;
            sweepText.setText(String.valueOf(sweepAmount));
            sweepS.setAmount(sweepAmount);
            sdb.updateSound(sweepS.getName(), sweepS.getAmount());
        }catch(Exception e){
            sweepText.setText(String.valueOf(sweepAmount));
            sdb.insertSound("sweep",0);
        }
    }
}
