package com.example.quranappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    DataBaseHelper myDBHlpr;
    TextView t;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            myDBHlpr = new DataBaseHelper(this);
            List<Surah> surahs = myDBHlpr.getSurahs();
            t = findViewById(R.id.textview);
            t.setText(surahs.get(0).getNameE());
        }
}