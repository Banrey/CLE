package com.example.cle;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MediaPlayer appIntro = MediaPlayer.create(Splash.this, R.raw.music);
        appIntro.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                 appIntro.stop();
                finish();
            }
        }, 6000);
    }
}