package com.catbusiness.karim.cattherapy;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.BoxInsetLayout;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import pl.droidsonroids.gif.GifImageButton;

public class HealingActivity extends WearableActivity {

    private static final SimpleDateFormat AMBIENT_DATE_FORMAT =
            new SimpleDateFormat("HH:mm", Locale.US);

    private GridLayout mContainerView;
    public int location = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healing);
        setAmbientEnabled();

        mContainerView = (GridLayout) findViewById(R.id.container);
    }

    @Override
    public void onEnterAmbient(Bundle ambientDetails) {
        super.onEnterAmbient(ambientDetails);
        updateDisplay();
    }

    @Override
    public void onUpdateAmbient() {
        super.onUpdateAmbient();
        updateDisplay();
    }

    @Override
    public void onExitAmbient() {
        updateDisplay();
        super.onExitAmbient();
    }

    private void updateDisplay() {
        if (isAmbient()) {
            mContainerView.setBackgroundColor(getResources().getColor(android.R.color.black));

        } else {
            mContainerView.setBackground(null);

        }
    }

    public void onClick(View view){
        GifImageButton mImageButton;
        mImageButton = (GifImageButton)view;
        location+=1;
        String code = "cat_" + String.valueOf(location);
        String source = "R.drawable." + code;
        int id = getResources().getIdentifier("catgif_2.gif", "drawable", getPackageName());
        mImageButton.setImageResource(R.drawable.catgif_2);

    }


}
