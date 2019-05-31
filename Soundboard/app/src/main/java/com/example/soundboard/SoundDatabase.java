package com.example.soundboard;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


@Database(entities = Sound.class, exportSchema = false, version = 1)
public abstract class SoundDatabase extends RoomDatabase {

    public abstract SoundDao soundDao();
}
