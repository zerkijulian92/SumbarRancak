package com.takatutustudio.sumbarrancak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class About extends AppCompatActivity {
    //Deklarasi
    Animation btt;

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //load animasi
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        //Load element
        btn_back    = findViewById(R.id.btn_back);

        //Run Animasi
        btn_back.startAnimation(btt);

        //Merubah judul halaman Detail Wisata
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Copyright");
        }
        //----

        //Kembali
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
