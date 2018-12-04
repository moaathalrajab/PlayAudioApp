package com.androidunleashed.playaudioapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ToggleButton;
import android.view.View;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;

public class PlayAudioAppActivity extends Activity {

    private int i = 0;
    private Button b;
    private MediaPlayer mp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_audio_app);

        final TextView response = (TextView)this.findViewById(R.id.response);
        response.setText("Select Play button to play audio");
        mp = MediaPlayer.create(PlayAudioAppActivity.this,R.raw.sleepaway);

        final ToggleButton playStopButton = (ToggleButton)
            findViewById(R.id.playstop_btn); 
        playStopButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                 if (playStopButton.isChecked()) {
                     response.setText(" Pause button to pause audio");
                     mp.start();
                 }
                else {
                    response.setText("Click Play ");
                    mp.pause();
                }
            }
        });

        findViewById(R.id.button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setText("Clicked " + ++i);
            }
        });
    }

}
