package com.example.android.tourguideapp;

public class Sites {

    // Name of the site
    private String mNameOfSite;

    // Description of the site
    private String mDescription;

    //Image resource ID for the site
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //Constant value that represents no image was provided for this site
    private static final int NO_IMAGE_PROVIDED = -1;

    //Create a new Sites object without image
    public Sites(String nameOfSite, String description) {
        mNameOfSite = nameOfSite;
        mDescription = description;
    }

    //Create a new Sites object with image
    public Sites(String nameOfSite, String description, int imageResourceId) {
        mNameOfSite = nameOfSite;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    //Get the namme of the site
    public String getNameOfSite() {
        return mNameOfSite;
    }

    //Get the description of the site
    public String getDescription() {
        return mDescription;
    }

    //Return the image resource ID of the site
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Returns whether or not there is an image for this site.
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}