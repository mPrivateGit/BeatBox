package com.example.aprivate.beatbox;

import android.support.v4.app.Fragment;
import com.example.aprivate.beatbox.abstract_fragment.SingleFragmentActivity;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
