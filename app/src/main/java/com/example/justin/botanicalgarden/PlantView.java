package com.example.justin.botanicalgarden;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PlantView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_view);
        ImageView plantView = (ImageView)findViewById(R.id.OpeningPicture);
        plantView.setImageResource(R.drawable.tree);
    }
}
