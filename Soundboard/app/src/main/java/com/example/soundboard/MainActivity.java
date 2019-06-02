//Anders Lassen - anlas17@student.sdu.dk
//Mathias Madsen - mathm17@student.sdu.dk
package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer bow;
    private MediaPlayer fart;
    private MediaPlayer mp5;
    private MediaPlayer sweep;
    private MediaPlayer bell;
    private MediaPlayer car;
    private MediaPlayer gulls;
    private MediaPlayer ufo;

    Integer bowAmount = new Integer(0);
    Integer sweepAmount = new Integer(0);
    Integer fartAmount = new Integer(0);
    Integer mp5Amount = new Integer(0);
    Integer bellAmount = new Integer(0);
    Integer carAmount = new Integer(0);
    Integer gullsAmount = new Integer(0);
    Integer ufoAmount = new Integer(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SoundRepository sdb = new SoundRepository(getApplicationContext());

        //Fills listView1 on UI with a list of sounds
        /*
        ListView listView = (ListView) findViewById(R.id.listView1);
        BaseAdapter soundAdapter = new SoundAdapter(sdb.getSounds());
        listView.setAdapter(soundAdapter);
        */

        Sound bowS = sdb.getSound("bow");
        Sound fartS = sdb.getSound("fart");
        Sound mp5S = sdb.getSound("mp5");
        Sound sweepS = sdb.getSound("sweep");
        Sound bellS = sdb.getSound("bell");
        Sound carS = sdb.getSound("car");
        Sound gullsS = sdb.getSound("gulls");
        Sound ufoS = sdb.getSound("ufo");


        TextView bowText = (TextView) findViewById(R.id.textbow);
        TextView fartText = (TextView) findViewById(R.id.textfart);
        TextView mp5Text = (TextView) findViewById(R.id.textmp5);
        TextView sweepText = (TextView) findViewById(R.id.textsweep);
        TextView bellText = (TextView) findViewById(R.id.textbell);
        TextView carText = (TextView) findViewById(R.id.textcar);
        TextView gullsText = (TextView) findViewById(R.id.textgulls);
        TextView ufoText = (TextView) findViewById(R.id.textufo);

        bowAmount = bowS.getAmount();
        fartAmount = fartS.getAmount();
        mp5Amount = mp5S.getAmount();
        sweepAmount = sweepS.getAmount();
        bellAmount = bellS.getAmount();
        carAmount = carS.getAmount();
        gullsAmount = gullsS.getAmount();
        ufoAmount = ufoS.getAmount();

        bowText.setText(String.valueOf(bowAmount));
        fartText.setText(String.valueOf(fartAmount));
        mp5Text.setText(String.valueOf(mp5Amount));
        sweepText.setText(String.valueOf(sweepAmount));
        bellText.setText(String.valueOf(bellAmount));
        carText.setText(String.valueOf(carAmount));
        gullsText.setText(String.valueOf(gullsAmount));
        ufoText.setText(String.valueOf(ufoAmount));


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
            /*
             ListView listView = (ListView) findViewById(R.id.listView1);
            BaseAdapter soundAdapter = new SoundAdapter(sdb.getSounds());
            listView.setAdapter(soundAdapter);
            */
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
            /*
             ListView listView = (ListView) findViewById(R.id.listView1);
            BaseAdapter soundAdapter = new SoundAdapter(sdb.getSounds());
            listView.setAdapter(soundAdapter);
            */
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
            /*
             ListView listView = (ListView) findViewById(R.id.listView1);
            BaseAdapter soundAdapter = new SoundAdapter(sdb.getSounds());
            listView.setAdapter(soundAdapter);
            */
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
            /*
             ListView listView = (ListView) findViewById(R.id.listView1);
            BaseAdapter soundAdapter = new SoundAdapter(sdb.getSounds());
            listView.setAdapter(soundAdapter);
            */
        }catch(Exception e){
            sweepText.setText(String.valueOf(sweepAmount));
            sdb.insertSound("sweep",0);
        }
    }

    public void bell(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        TextView bellText = (TextView) findViewById(R.id.textbell);
        bell = MediaPlayer.create(this, R.raw.bell);

        bell.start();
        Sound bellS;

        try {
            bellS = sdb.getSound("bell");
            bellAmount = bellS.getAmount() + 1;
            bellText.setText(String.valueOf(bellAmount));
            bellS.setAmount(bellAmount);
            sdb.updateSound(bellS.getName(), bellS.getAmount());
            /*
             ListView listView = (ListView) findViewById(R.id.listView1);
            BaseAdapter soundAdapter = new SoundAdapter(sdb.getSounds());
            listView.setAdapter(soundAdapter);
            */
        }catch(Exception e){
            bellText.setText(String.valueOf(bellAmount));
            sdb.insertSound("bell",0);
        }

    }

    public void car(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        TextView carText = (TextView) findViewById(R.id.textcar);
        car = MediaPlayer.create(this, R.raw.car);

        car.start();
        Sound carS;

        try {
            carS = sdb.getSound("car");
            carAmount = carS.getAmount() + 1;
            carText.setText(String.valueOf(carAmount));
            carS.setAmount(carAmount);
            sdb.updateSound(carS.getName(), carS.getAmount());
            /*
             ListView listView = (ListView) findViewById(R.id.listView1);
            BaseAdapter soundAdapter = new SoundAdapter(sdb.getSounds());
            listView.setAdapter(soundAdapter);
            */
        }catch(Exception e){
            carText.setText(String.valueOf(carAmount));
            sdb.insertSound("car",0);
        }

    }

    public void gulls(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        TextView gullsText = (TextView) findViewById(R.id.textgulls);
        gulls = MediaPlayer.create(this, R.raw.gulls);

        gulls.start();
        Sound gullsS;

        try {
            gullsS = sdb.getSound("gulls");
            gullsAmount = gullsS.getAmount() + 1;
            gullsText.setText(String.valueOf(gullsAmount));
            gullsS.setAmount(gullsAmount);
            sdb.updateSound(gullsS.getName(), gullsS.getAmount());
            /*
             ListView listView = (ListView) findViewById(R.id.listView1);
            BaseAdapter soundAdapter = new SoundAdapter(sdb.getSounds());
            listView.setAdapter(soundAdapter);
            */
        }catch(Exception e){
            gullsText.setText(String.valueOf(gullsAmount));
            sdb.insertSound("gulls",0);
        }

    }

    public void ufo(View view){
        SoundRepository sdb = new SoundRepository(getApplicationContext());
        TextView ufoText = (TextView) findViewById(R.id.textufo);
        ufo = MediaPlayer.create(this, R.raw.ufo);

        ufo.start();
        Sound ufoS;

        try {
            ufoS = sdb.getSound("ufo");
            ufoAmount = ufoS.getAmount() + 1;
            ufoText.setText(String.valueOf(ufoAmount));
            ufoS.setAmount(ufoAmount);
            sdb.updateSound(ufoS.getName(), ufoS.getAmount());
            /*
             ListView listView = (ListView) findViewById(R.id.listView1);
            BaseAdapter soundAdapter = new SoundAdapter(sdb.getSounds());
            listView.setAdapter(soundAdapter);
            */
        }catch(Exception e){
            ufoText.setText(String.valueOf(ufoAmount));
            sdb.insertSound("ufo",0);
        }

    }
}
