package com.example.tony.funforlouis.dummy;


import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by tony on 03/08/15.
 */
public class mainview {

    startActivity(YouTubeStandalonePlayer.createVideoIntent(getActivity(),
    DEVELOPER_KEY, video.id, 0, true, true));

}
