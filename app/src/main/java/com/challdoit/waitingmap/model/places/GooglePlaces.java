package com.challdoit.waitingmap.model.places;

/**
 * Created by David on 8/26/14.
 */
public class GooglePlaces {

    public static final String API_URL = "https://maps.googleapis.com/maps/api/place";
    public static final String RESPONSE_FORMAT = "/json";

    /**
     * List of possible actions
     */
    public static final String METHOD_NEARBY_SEARCH = "nearbysearch";
    public static final String METHOD_TEXT_SEARCH = "textsearch";
    public static final String METHOD_RADAR_SEARCH = "radarsearch";
    public static final String METHOD_DETAILS = "details";
    public static final String METHOD_ADD = "add";
    public static final String METHOD_DELETE = "delete";
    public static final String METHOD_EVENT_DETAILS = "event/details";
    public static final String METHOD_EVENT_ADD = "event/add";
    public static final String METHOD_EVENT_DELETE = "event/delete";
    public static final String METHOD_BUMP = "bump";
    public static final String METHOD_AUTOCOMPLETE = "autocomplete";
    public static final String METHOD_QUERY_AUTOCOMPLETE = "queryautocomplete";

    /**
     * The maximum search radius for places.
     */
    public static final double MAXIMUM_RADIUS = 50000;

    /**
     * The maximum amount of results that can be on one single page.
     */
    public static final int MAXIMUM_PAGE_RESULTS = 20;
    /**
     * The maximum results that can be returned.
     */
    public static final int MAXIMUM_RESULTS = 60;



}
