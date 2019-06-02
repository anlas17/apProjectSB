package com.example.soundboard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class SoundAdapter extends BaseAdapter {
    List<Sound> sounds;

    public SoundAdapter(List<Sound> soundList){
        sounds = soundList;
    }

    @Override
    public int getCount(){
        return sounds.size();
    }
    @Override
    public Object getItem(int position){
        return sounds.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            Context context = parent.getContext();
            LinearLayout view = new LinearLayout(context);
            view.setOrientation(LinearLayout.HORIZONTAL);
            view.addView(new CheckBox(context));
            TextView nameTextView = new TextView(context);
            nameTextView.setText(sounds.get(position).getName());
            nameTextView.setPadding(0, 0, 10, 0);
            view.addView(nameTextView);
            TextView parTextView = new TextView(context);
            parTextView.setText(Integer.toString(sounds.get(position).getAmount()));
            view.addView(parTextView);
            return view;
        }
        return convertView;
    }

}
