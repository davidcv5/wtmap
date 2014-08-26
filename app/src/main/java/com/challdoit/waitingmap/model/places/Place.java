package com.challdoit.waitingmap.model.places;

import java.util.List;

/**
 * Created by David on 8/23/14.
 */
public class Place {
    public List<AddressComponent> addressComponents;
    public List<Event> events;
    public String formattedAddress;
    public String formattedPhoneNumber;
    public Geometry geometry;
    public String icon;
    public String internationalPhoneNumber;
    public String name;
    public Hours openingHours;
    public List<Photo> photos;
    public String placeId;
    public Scope scope;
    public List<AltId> altIds;
    public Price priceLevel;
    public float rating;
    public List<Review> reviews;
    public List<String> types;
    public String url;
    public int utcOffset;
    public String vicinity;
    public String website;
}
