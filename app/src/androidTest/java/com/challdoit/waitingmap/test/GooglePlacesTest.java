package com.challdoit.waitingmap.test;

import android.util.Log;

import com.challdoit.waitingmap.model.places.GooglePlaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

/**
 * Created by David on 8/26/14.
 */
@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class GooglePlacesTest {

    private GooglePlaces googlePlaces = new GooglePlaces();
    private String searchResult;

    public void setUp() {
    }

    @Test
    public void testSomething() {
        assertEquals("hello", "hello");
    }

}
