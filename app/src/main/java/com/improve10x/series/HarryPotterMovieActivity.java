package com.improve10x.series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class HarryPotterMovieActivity extends AppCompatActivity {
    MovieItem[] movieItems;
    GridView moviesGv;
    MoviesItemAdapter moviesItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harry_potter_movie);
        initViews();
        createData();
        setAdapter();
        connectAdapter();
    }

    public void createData() {
        movieItems = new MovieItem[6];

        movieItems[0] = new MovieItem();
        movieItems[0].movieName = "Harry potter and the scorer's stone";
        movieItems[0].imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220 ";

        movieItems[1] = new MovieItem();
        movieItems[1].movieName = "Harry potter and chamber of secrets";
        movieItems[1].imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";

        movieItems[2] = new MovieItem();
        movieItems[2].movieName = "Harry potter and the prisoner of azkaban";
        movieItems[2].imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";

        movieItems[3] = new MovieItem();
        movieItems[3].movieName = "Harry potter and the goblet of fire";
        movieItems[3].imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";

        movieItems[4] = new MovieItem();
        movieItems[4].movieName = "Harry Potter and the Order of the Phoenix";
        movieItems[4].imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";

        movieItems[5] = new MovieItem();
        movieItems[5].movieName = "Harry Potter and the Half-Blood Prince";
        movieItems[5].imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg";
    }

    public void setAdapter() {
        moviesItemAdapter = new MoviesItemAdapter(this, R.layout.movies_item, movieItems);
    }

    public void connectAdapter(){
        moviesGv.setAdapter(moviesItemAdapter);
    }

    public void initViews(){
        moviesGv = findViewById(R.id.movie_gv);
        moviesGv.setNumColumns(2);
    }
}