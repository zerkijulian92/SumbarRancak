package com.takatutustudio.sumbarrancak;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewWisataAdapter extends RecyclerView.Adapter<CardViewWisataAdapter.CardViewHolder> {

    private ArrayList<WisataSumbar>listWisataSumbar;
    private Context context;
    private Activity activity;

    public CardViewWisataAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<WisataSumbar>getListWisataSumbar() {
        return listWisataSumbar;
    }

    public void  setListWisataSumbar(ArrayList<WisataSumbar> listWisataSumbar) {
        this.listWisataSumbar = listWisataSumbar;
    }


    @Override
    public CardViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_wisata, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        final WisataSumbar k = getListWisataSumbar().get(position);
        Glide.with(context)
                .load(k.getPhoto())
                .override(150,230)
                .into(holder.imgPhoto);

        holder.tvname.setText(k.getName());
        holder.tvremarks.setText(k.getRemarks());
        holder.wisatasumbar = k;

       holder.btnsahre.setOnClickListener(new CustomOnitemClickListener(position, new CustomOnitemClickListener.OnItemClickCallback() {
           @Override
           public void onItemClicked(View view, int position) {
               Toast.makeText(context, "Share" + getListWisataSumbar().get(position).getName(), Toast.LENGTH_SHORT).show();
           }
       }) {
           @Override
           public void onItemClicked(View view, int position) {

           }
       });

    }

    @Override
    public int getItemCount() {
        return getListWisataSumbar().size();
    }

    public void startactivity(Intent intent){

    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvname, tvremarks;
        Button btndetail, btnsahre;
        WisataSumbar wisatasumbar;


        public CardViewHolder( View itemView) {
            super(itemView);
            imgPhoto    = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvname      = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvremarks   = (TextView)itemView.findViewById(R.id.tv_alamat_lokasi);
            btnsahre = (Button)itemView.findViewById(R.id.btn_set_share);
            btndetail   = (Button)itemView.findViewById(R.id.btn_set_detail);
            btndetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DetailWisataAcitivity.class);
            intent.putExtra("key", wisatasumbar);
            context.startActivity(intent);
        }
    }
}
