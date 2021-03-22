package com.example.uts_33615_el;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMusicAdapter extends
        RecyclerView.Adapter<ListMusicAdapter.ListViewHolder> {

    Context context;
    List<ListModel> modelList;

    public ListMusicAdapter(Context context, List<ListModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_music, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        String title = modelList.get(position).getSongTitle();
        String singer = modelList.get(position).getSongSinger();

        holder.title.setText(title);
        holder.singer.setText(singer);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title, singer;
        public ListViewHolder(@NonNull View itemView){
                    super(itemView);
                    title = itemView.findViewById(R.id.song_title);
                    singer = itemView.findViewById(R.id.song_singer);
                    itemView.setOnClickListener(this);
            }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Intent intListMusic = new Intent(context, PlayMusicActivity.class);
            context.startActivity(intListMusic);
        }
    }
    }
