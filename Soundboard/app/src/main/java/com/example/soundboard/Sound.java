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
    private Integer amount;

    public Sound(String name, Integer amount){
    this.name = name;
    this.amount = amount;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAmount(){
        return amount;
    }
    public void setAmount(Integer amount){
        this.amount = amount;
    }
}
