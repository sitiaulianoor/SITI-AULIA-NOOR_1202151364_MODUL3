package com.example.awl.sitiaulianoor_1202151364_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Title;
    private ArrayList<String> Desc;
    private ArrayList<Integer> Gambar;

    //daftar minuman
    private String[] title = {"Ades","Amidis","Aqua","Cleo","Club","Equil","Evian","Leminerale","Nestle","Pristine","Vit"};
    //daftar minuman
    private String[] desc = {"Ini adalah minuman merek Ades","Ini adalah minuman merek Amidis","Ini adalah minuman merek Aqua",
            "Ini adalah minuman merek Cleo","Ini adalah minuman merek Club","Ini adalah minuman merek Equil","Ini adalah minuman merek Evian",
            "Ini adalah minuman merek Leminerale","Ini adalah minuman merek Nestle","Ini adalah minuman merek Pristine","Ini adalah minuman merek Vit"};
    //daftar gambar
    private int[] gambar = {R.drawable.ades,R.drawable.amidis,R.drawable.aqua,R.drawable.cleo,R.drawable.club,R.drawable.equil,R.drawable.evian,
            R.drawable.leminerale,R.drawable.nestle,R.drawable.pristine,R.drawable.vit};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title = new ArrayList<>();
        Desc = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView = findViewById(R.id.rView);

        DaftarItem();
        //Layout Manager, untuk membuat list secara vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(Title, Desc, Gambar);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    private void DaftarItem() {
        for (int a=0; a<title.length; a++) {
            Gambar.add(gambar[a]);
            Title.add(title[a]);
            Desc.add(desc[a]);
        }
    }
}
