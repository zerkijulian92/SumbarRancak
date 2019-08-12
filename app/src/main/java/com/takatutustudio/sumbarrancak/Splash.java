package com.takatutustudio.sumbarrancak;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

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
        }, 2200); //1000 ms = 1second
    }
}
