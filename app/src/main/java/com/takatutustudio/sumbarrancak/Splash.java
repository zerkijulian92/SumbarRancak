package com.takatutustudio.sumbarrancak;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    //deklarasi
    Animation app_splash, btt;
    ImageView app_logo;
    TextView app_subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //load animasi
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        //Load element
        app_logo       = findViewById(R.id.app_logo);
        app_subtitle   = findViewById(R.id.app_subtitle);

        //Run Animasi
        app_logo.startAnimation(app_splash);
        app_subtitle.startAnimation(btt);

        //Setting Timer Untuk 1 Detik
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Merubah Activity ke Activity Lain
                Intent gotomain = new Intent(Splash.this, MainActivity.class);
                startActivity(gotomain);
                finish();
            }
        }, 2400); //1000 ms = 1second
    }
}
