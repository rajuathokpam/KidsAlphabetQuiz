package com.itservz.android.mayekplay.visual;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.itservz.android.mayekplay.R;

public class VisualActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_visual);
    }
}
