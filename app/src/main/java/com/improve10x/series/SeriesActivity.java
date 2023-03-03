package com.improve10x.series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class SeriesActivity extends AppCompatActivity {
    SeriesItem[] seriesItems;
    SeriesItemAdapter seriesItemAdapter;
    ListView seriesItemLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        initViews();
        createData();
        setupAdapter();
        connectAdapter();
    }

    private void initViews() {
        seriesItemLv = findViewById(R.id.series_item_lv);
    }

    public void createData() {
        seriesItems = new SeriesItem[2];

        seriesItems[0] = new SeriesItem();
        seriesItems[0].name = "Kung Fu Panda";
        seriesItems[0].imageUrl = "https://images.indianexpress.com/2022/07/Kung-Fu-Panda-The-Dragon-Knight-review-1200.jpg?w=480";

        seriesItems[1] = new SeriesItem();
        seriesItems[1].name = "Harry Porter";
        seriesItems[1].imageUrl = "https://imageio.forbes.com/specials-images/imageserve/5efa33eed4034b0007bf4b5c/Harry-Potter-movies-to-leave-HBO-Max--the-WarnerMedia-streaming-platform--in-August/960x0.jpg?format=jpg&width=960";
    }

    public void setupAdapter(){
        seriesItemAdapter = new SeriesItemAdapter(this,R.layout.series_item,seriesItems);
    }

    public void connectAdapter(){
       seriesItemLv.setAdapter(seriesItemAdapter);
    }
}