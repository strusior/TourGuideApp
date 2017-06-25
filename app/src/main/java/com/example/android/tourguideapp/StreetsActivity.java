package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class StreetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streets);

        // Create a list of sites
        final ArrayList<Sites> sites = new ArrayList<Sites>();
        sites.add(new Sites(getString(R.string.raclawicka_description), getString(R.string.raclawicka)));
        sites.add(new Sites(getString(R.string.zwirki_description), getString(R.string.zwirki)));
        sites.add(new Sites(getString(R.string.woronicza_description), getString(R.string.woronicza)));
        sites.add(new Sites(getString(R.string.woloska_description), getString(R.string.woloska)));
        sites.add(new Sites(getString(R.string.etude_description), getString(R.string.etude)));

        // Create a SiteAdapter, whose data source is a list of sites. The
        // adapter knows how to create list items for each item in the list.
        SitesAdapter adapter = new SitesAdapter(this, sites, R.color.streets);

        // Find the ListView object in the view hierarchy of the  Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // site_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the SitesAdapter we created above, so that the
        // ListView will display list items for each Site in the list.
        listView.setAdapter(adapter);
    }
}