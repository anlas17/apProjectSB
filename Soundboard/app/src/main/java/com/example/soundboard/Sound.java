package com.example.soundboard;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;


@Entity(tableName = "sound")
public class Sound {
    @PrimaryKey()
    @NonNull
    private String name;
    @ColumnInfo(name = "amount")
    private int amount;

    public Sound(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
}
