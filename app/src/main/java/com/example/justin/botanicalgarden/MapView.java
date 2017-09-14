package com.example.justin.botanicalgarden;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MapView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);

        ImageView mapImage = (ImageView)findViewById(R.id.OpeningPicture);
        mapImage.setImageResource(R.drawable.map_place_holder);
    }
}
