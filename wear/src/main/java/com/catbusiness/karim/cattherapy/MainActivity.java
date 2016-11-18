package com.catbusiness.karim.cattherapy;

import android.app.Activity;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onBeginHealing(View v){
        Intent healingIntent = new Intent(this, HealingActivity.class);
        startActivity(healingIntent);
    }

}
