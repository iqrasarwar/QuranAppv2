package com.example.quranappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class SurahContent extends AppCompatActivity {

    QDH store;
    QuranArabicText q;
    TextView name,content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        store = new QDH();
        q = new QuranArabicText();
        setContentView(R.layout.activity_surah_content);
        name= findViewById(R.id.textView5);
        content = findViewById(R.id.textView6);
        Intent i = getIntent();
        if(i.getExtras() != null)
        {
            int index = Integer.parseInt(i.getStringExtra("index"));
            int surahstart = store.getSurahStart(index);
            int surahend = store.getSurahVerses(index);
            int length = surahend+surahstart;
            String namee =store.getSurahName(index);
        String contentt = new String();
        for(int in =surahstart -1 ;in<length;in++) {
                contentt += q.QuranArabicText[in];
        }
        name.setText(namee);
        content.setText(contentt);
        }
        Typeface typeface = Typeface.createFromAsset(
                getAssets(),
                "noorehuda.ttf");
        content.setTypeface(typeface);
    }
}