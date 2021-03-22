package com.example.uts_33615_el;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

public class MusicActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ListModel> modelList;
    ListMusicAdapter listMusicAdapter;
    Dialog popUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        recyclerView = findViewById(R.id.rvMusic);
        modelList = new ArrayList<>();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        modelList.add(new ListModel("Yellow", "Coldplay"));
        modelList.add(new ListModel("C.H.R.I.S.Y.E", "Diskoria feat. Eva Celia"));
        modelList.add(new ListModel("L-O-V-E", "JJ Heller"));
        listMusicAdapter = new ListMusicAdapter(MusicActivity.this, modelList);
        //set MainAdapter to RecyclerView
        recyclerView.setAdapter(listMusicAdapter);
        openDialog();
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.popup_menu, menu);
            return true;
        }

        private void openDialog() {
            popUp = new Dialog(MusicActivity.this);
            popUp.setContentView(R.layout.popup);

            popUp.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            popUp.setCancelable(false);

        Button btn_ok = popUp.findViewById(R.id.btnOK);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUp.dismiss();
            }
        });
        popUp.show();
        }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.option_profil) {
            Intent intProf = new Intent(MusicActivity.this, ProfilActivity.class);
            startActivity(intProf);
        }
        if (id==R.id.option_logout) {
            Intent intMain = new Intent(MusicActivity.this, MainActivity.class);
            startActivity(intMain);
        }
        return super.onOptionsItemSelected(item);
        }
    }
