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

public class MoviesItemAdapter extends ArrayAdapter<MovieItem> {
    public MoviesItemAdapter(@NonNull Context context, int resource, @NonNull MovieItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MovieItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.movies_item,parent,false);
        TextView movieNameTxt = view.findViewById(R.id.movie_name_txt);
        movieNameTxt.setText(item.movieName);
        ImageView moviePosterIv = view.findViewById(R.id.movie_poster_iv);
        Picasso.get().load(item.imageUrl).into(moviePosterIv);
        return view;
    }
}
