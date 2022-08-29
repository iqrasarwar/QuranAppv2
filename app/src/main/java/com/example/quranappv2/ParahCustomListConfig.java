package com.example.quranappv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ParahCustomListConfig extends ArrayAdapter<Parah> {
    public ParahCustomListConfig(@NonNull Context context, int resource,
                                 @NonNull List<Parah> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Parah s =  getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.surah_item,parent,
                false);
        TextView id = convertView.findViewById(R.id.textView);
        TextView nameU = convertView.findViewById(R.id.textView3);
        TextView nameE = convertView.findViewById(R.id.textView2);
        id.setText(s.getId());
        nameU.setText(s.getNameE());
        nameE.setText(s.getNameU());
        return convertView;
    }
}
