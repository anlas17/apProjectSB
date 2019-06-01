package com.example.soundboard;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.content.Context;

import java.util.List;

public class SoundRepository {
    private String DB_NAME = "SoundDB";
    private SoundDatabase sInstance;

    public SoundRepository(Context context){
            sInstance = Room.databaseBuilder(context, SoundDatabase.class, DB_NAME).allowMainThreadQueries().build();
    }

    public void insertSound(String name, Integer amount){
        Sound sound = new Sound("",0);
        sound.setName(name);
        sound.setAmount(amount);
        sInstance.soundDao().insertSound(sound);
    }

    public void updateSound(String name, Integer amount){
        Sound sound = new Sound("", 0);
        sound.setName(name);
        sound.setAmount(amount);
        sInstance.soundDao().updateSound(sound);
    }

    public void deleteSound(String name){
        Sound sound = new Sound("", 0);
        sound.setName(name);
        sound.setAmount(0);
        sInstance.soundDao().deleteSound(sound);
    }

    public Sound getSound(String name){
        return sInstance.soundDao().loadSoundByName(name);
    }
    public List<Sound> getSounds(){
        return sInstance.soundDao().getSoundList();
    }
}
