package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that is responsible for sending to streets list
        TextView streets = (TextView) findViewById(R.id.streets_button);

        // Set a click listener on that View
        streets.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play View is clicked on.
            @Override
            public void onClick(View view) {
                Intent streetsIntent = new Intent(MainActivity.this, StreetsActivity.class);
                startActivity(streetsIntent);
            }
        });

        // Find the View that is responsible for sending to green areas list
        TextView greenAreas = (TextView) findViewById(R.id.green_areas_button);

        // Set a click listener on that View
        greenAreas.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent greenAreasIntent = new Intent(MainActivity.this, GreenAreasActivity.class);
                startActivity(greenAreasIntent);
            }
        });

        // Find the View that is responsible for sending to historical sites list
        TextView historicalSites = (TextView) findViewById(R.id.historical_sites);

        // Set a click listener on that View
        historicalSites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent historicalSitesIntent = new Intent(MainActivity.this, HistoricalSitesActivity.class);
                startActivity(historicalSitesIntent);
            }
        });

        // Find the View that is responsible for sending to other sites list
        TextView otherSites = (TextView) findViewById(R.id.other_sites);

        // Set a click listener on that View
        otherSites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent otherSitesIntent = new Intent(MainActivity.this, OtherSitesActivity.class);
                startActivity(otherSitesIntent);
            }
        });
    }
}
