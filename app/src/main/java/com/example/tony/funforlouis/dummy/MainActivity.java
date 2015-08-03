package com.example.tony.funforlouis.dummy;


import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.crashlytics.android.Crashlytics;
import com.example.tony.funforlouis.R;
import com.google.android.youtube.player.YouTubeApiServiceUtil;
import com.google.android.youtube.player.YouTubeInitializationResult;

import io.fabric.sdk.android.Fabric;

public class MainActivity  {

    // Checks if the youtube app is in the phone

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Check for any issues
        final YouTubeInitializationResult result = YouTubeApiServiceUtil.isYouTubeApiServiceAvailable(this);

        if (result != YouTubeInitializationResult.SUCCESS) {
            //If there are any issues we can show an error dialog.
            result.getErrorDialog(this, 0).show();
        }
    }


}
