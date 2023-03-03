package com.improve10x.series;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class SeriesItemAdapter extends ArrayAdapter<SeriesItem> {
    public SeriesItemAdapter(@NonNull Context context, int resource, @NonNull SeriesItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SeriesItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.series_item, parent,false);
        TextView nameTxt = view.findViewById(R.id.name_txt);
        nameTxt.setText(item.name);
        ImageView posterIv = view.findViewById(R.id.poster_iv);
        Picasso.get().load(item.imageUrl).into(posterIv);
        return view;
    }
}
