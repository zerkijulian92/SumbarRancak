package com.takatutustudio.sumbarrancak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<WisataSumbar>list;

    private String title = "Sumbar Rancak"; // merubah judul halaman

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setActionBarTitle(title);


        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(WisataData.getListData());
        showRecyclerCardView();

    }

    //Merubah Judul Halaman
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);

        }
    }


    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewWisataAdapter cardViewWisataAdapter= new CardViewWisataAdapter(this);
        cardViewWisataAdapter.setListWisataSumbar(list);
        rvCategory.setAdapter(cardViewWisataAdapter);
    }


// Menu Action Bar

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                Intent gotoabout = new Intent(MainActivity.this, About.class);
                startActivity(gotoabout);
                break;
        }
    }

}
