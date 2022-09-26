package com.example.quranappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    QDH store;
    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.listview);
        store = new QDH();
//        List<String>  surah = store.GetSurahNames();
        ArrayList<Surah> arraylist = new ArrayList<Surah>();
        for (int i = 0; i < 15; i++) {
            String ss = Integer.toString(store.getSurahVerses(i))+" Verses";
            arraylist.add(new Surah(store.getSurahName(i),Integer.toString(i+1),
                   ss) );
        }
        SurahListConfig list = new SurahListConfig(this,0,arraylist);
        l.setAdapter(list);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SurahContent.class);
                intent.putExtra("index", l + "");
                startActivity(intent);
            }
        });
//        tv = findViewById(R.id.textview);
//        Typeface typeface = Typeface.createFromAsset(
//                getAssets(),
//                "noorehuda.ttf");
//        content.setTypeface(typeface);
    }
}