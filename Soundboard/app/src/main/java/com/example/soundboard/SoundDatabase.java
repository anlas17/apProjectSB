package com.example.soundboard;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.util.Log;

import java.util.List;

@Database(entities = Sound.class, exportSchema = false, version = 1)
public abstract class SoundDatabase extends RoomDatabase {

    public abstract SoundDao soundDao();
}
