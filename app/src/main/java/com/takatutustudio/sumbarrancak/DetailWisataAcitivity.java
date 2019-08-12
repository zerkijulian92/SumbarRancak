package com.takatutustudio.sumbarrancak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
public class DetailWisataAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);


        //Merubah judul halaman Detail Wisata
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Wisata");
        }
        //----

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WisataSumbar wisatasumbarditerima = getIntent().getParcelableExtra("key");


        ImageView gambar    = (ImageView)findViewById(R.id.img_item_photo);
        TextView name       = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks    = (TextView)findViewById(R.id.tv_alamat_lokasi);
        TextView deskripsi  = (TextView)findViewById(R.id.content_detail);

        Glide.with(this).load(wisatasumbarditerima.getPhoto()).override(150,230).into(gambar);
        name.setText(wisatasumbarditerima.getName());
        remarks.setText(wisatasumbarditerima.getRemarks());
        deskripsi.setText(wisatasumbarditerima.getDeskripsi());

        Log.i("photo", wisatasumbarditerima.getPhoto());
        Log.i("deskripsi", wisatasumbarditerima.getDeskripsi());




    }



}
