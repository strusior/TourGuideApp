package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * { SitesAdapter} provides the layout (excluding introductory description) for each list item
 * based on a data source, which is a list of { sites} objects.
 */
public class SitesAdapter extends ArrayAdapter<Sites>  {

    /** Resource ID for the background color for this list of sites */
    private int mColorResourceId;

    /**
     * Create a new { SitesAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param sites is the list of Sites to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of sites
     */
    public SitesAdapter(Context context, ArrayList<Sites> sites, int colorResourceId) {
        super(context, 0, sites);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.sites_item, parent, false);
        }

        Sites currentSite = getItem(position);

        // Find the TextView in the sites_item.xml layout with the ID description_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the description from the currentSite object and set this text on
        // the description TextView.
        descriptionTextView.setText(currentSite.getDescription());

        // Find the TextView in the site_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name of site from the currentSite object and set this text on
        // the name TextView.
        nameTextView.setText(currentSite.getNameOfSite());

        // Find the ImageView in the site_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this site or not
        if (currentSite.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSite.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the site item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole site item layout (containing 2 TextViews) so that it can be shown in
        // the SiteView.
        return listItemView;
    }
}