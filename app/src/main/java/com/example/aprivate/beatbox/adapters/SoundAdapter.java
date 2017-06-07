package com.example.aprivate.beatbox.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.aprivate.beatbox.Sound;
import com.example.aprivate.beatbox.holders.SoundHolder;

import java.util.List;


public class SoundAdapter extends RecyclerView.Adapter<SoundHolder>{
    private List<Sound> mSounds;

    public SoundAdapter(List<Sound> sounds) {
        mSounds = sounds;
    }

    @Override
    public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new SoundHolder(inflater, parent);
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
