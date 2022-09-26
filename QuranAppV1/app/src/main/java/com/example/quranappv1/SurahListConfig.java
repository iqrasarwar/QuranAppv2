package com.example.quranappv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SurahListConfig extends ArrayAdapter<Surah> {
    public SurahListConfig(@NonNull Context context, int resource,
                       @NonNull List<Surah> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Surah s =  getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.surah_item,parent,
                false);
        TextView number = convertView.findViewById(R.id.textView);
        TextView name = convertView.findViewById(R.id.textView2);
        TextView verses = convertView.findViewById(R.id.textView3);
        number.setText(s.getSurahNumber());
        name.setText(s.getSurahName());
        verses.setText(s.getSurahVerseCount());
        return convertView;
    }
}
