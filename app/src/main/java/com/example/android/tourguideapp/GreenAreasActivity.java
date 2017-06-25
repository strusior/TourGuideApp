package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class GreenAreasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_sites);

        // Create a list of sites
        final ArrayList<Sites> sites = new ArrayList<Sites>();
        sites.add(new Sites(getString(R.string.pole_descritpion), getString(R.string.pole)));
        sites.add(new Sites(getString(R.string.park_description), getString(R.string.park)));
        sites.add(new Sites(getString(R.string.small_park_descrition), getString(R.string.small_park)));
        sites.add(new Sites(getString(R.string.gardening_school_description), getString(R.string.gardening_school)));
        sites.add(new Sites(getString(R.string.marina_mokotow_description), getString(R.string.marina_mokotow)));
        sites.add(new Sites(getString(R.string.parcels_description), getString(R.string.parcels)));

        // Create a SiteAdapter, whose data source is a list of sites. The
        // adapter knows how to create list items for each item in the list.
        SitesAdapter adapter = new SitesAdapter(this, sites, R.color.green_areas);

        // Find the ListView object in the view hierarchy of the  Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // site_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the SitesAdapter we created above, so that the
        // ListView will display list items for each Site in the list.
        listView.setAdapter(adapter);
    }
}