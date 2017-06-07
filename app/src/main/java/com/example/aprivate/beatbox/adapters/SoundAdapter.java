package com.example.aprivate.beatbox.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.aprivate.beatbox.Sound;
import com.example.aprivate.beatbox.holders.SoundHolder;

import java.util.List;


public class SoundAdapter extends RecyclerView.Adapter<SoundHolder>{
    private List<Sound> mSounds;
    private Context context;

    public SoundAdapter(List<Sound> sounds, Context context) {
        mSounds = sounds;
        this.context = context;
    }

    @Override
    public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new SoundHolder(inflater, parent, context);
    }

    @Override
    public void onBindViewHolder(SoundHolder holder, int position) {
        Sound sound = mSounds.get(position);
        holder.bindSound(sound);
    }

    @Override
    public int getItemCount() {
        return mSounds.size();
    }
}
