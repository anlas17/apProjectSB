package com.example.soundboard;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface SoundDao {
    @Query("SELECT * FROM SOUND")
    List<Sound> getSoundList();
    @Insert
    void insertSound(Sound sound);
    @Update
    void updateSound(Sound sound);
    @Delete
    void deleteSound(Sound sound);
    @Query("SELECT * FROM SOUND WHERE name = :name")
    Sound loadSoundByName(String name);
}
