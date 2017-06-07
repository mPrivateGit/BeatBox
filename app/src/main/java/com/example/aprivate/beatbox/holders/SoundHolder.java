package com.example.aprivate.beatbox.holders;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aprivate.beatbox.R;
import com.example.aprivate.beatbox.Sound;

public class SoundHolder extends RecyclerView.ViewHolder{
    private Button mButton;
    private Sound mSound;

    public SoundHolder(LayoutInflater inflater, ViewGroup container) {
        super(inflater.inflate(R.layout.list_item_sound, container, false));

        mButton = (Button) itemView.findViewById(R.id.list_item_sound_button);
    }

    public void bindSound(Sound sound) {
        mSound = sound;
        mButton.setText(mSound.getName());
    }
}
