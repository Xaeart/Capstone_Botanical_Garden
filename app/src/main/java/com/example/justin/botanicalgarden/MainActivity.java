package com.example.justin.botanicalgarden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView openingPicture = (ImageView)findViewById(R.id.OpeningPicture);
        openingPicture.setImageResource(R.drawable.uncc_cone_entry1);

        Button enter = (Button) findViewById(R.id.btnEnterGarden);
        enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapView.class);
                startActivity(intent);
            }

        });

        }

    }

