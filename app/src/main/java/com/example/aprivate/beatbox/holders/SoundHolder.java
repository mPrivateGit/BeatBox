package com.example.aprivate.beatbox.holders;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aprivate.beatbox.BeatBox;
import com.example.aprivate.beatbox.R;
import com.example.aprivate.beatbox.Sound;

public class SoundHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener{
    private Button mButton;
    private Sound mSound;
    private Context context;

    public SoundHolder(LayoutInflater inflater, ViewGroup container, Context context) {
        super(inflater.inflate(R.layout.list_item_sound, container, false));

        this.context = context;
        mButton = (Button) itemView.findViewById(R.id.list_item_sound_button);
        mButton.setOnClickListener(this);
    }

    public void bindSound(Sound sound) {
        mSound = sound;
        mButton.setText(mSound.getName());
    }

    @Override
    public void onClick(View v) {
        BeatBox beatBox = new BeatBox(context);
        beatBox.play(mSound);
    }
}
