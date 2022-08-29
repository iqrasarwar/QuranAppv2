package com.example.quranappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SurahContext extends AppCompatActivity {
    Store store;
    DataBaseHelper db;
    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_context);
        store = new Store();
        l = findViewById(R.id.listview);
        db = new DataBaseHelper(SurahContext.this);
        ArrayList<Ayat> ayat = db.getAyat();
        ArrayList<Ayat> thisSurahAyat = new ArrayList<>();
        Intent i = getIntent();
        if(i.getExtras() != null) {
            int index = Integer.parseInt(i.getStringExtra("index"));
            for (int ind = 0; ind < ayat.size(); ind++) {
                String id = ayat.get(ind).getSuratId();
                if (id == Integer.toString(index)) {
                    thisSurahAyat.add(ayat.get(ind));
                }
            }
        }
        AyatCustomListConfig list = new AyatCustomListConfig(this, 0, thisSurahAyat);
        l.setAdapter(list);
//        Typeface typeface = Typeface.createFromAsset(
//                getAssets(),
//                "noorehuda.ttf");
//        content.setTypeface(typeface);
    }
}