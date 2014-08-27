package com.challdoit.waitingmap.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.challdoit.waitingmap.R;
import com.challdoit.waitingmap.model.places.PlacesResult;
import com.challdoit.waitingmap.toolbox.GsonRequest;
import com.challdoit.waitingmap.toolbox.OkHttpStack;
import com.google.gson.Gson;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mTextView = (TextView) findViewById(R.id.text);

        RequestQueue queue = Volley.newRequestQueue(this, new OkHttpStack());
        String url = "https://maps.googleapis.com/maps/api/place/search/json?location=37.787930,-122.4074990&radius=1000&key=AIzaSyAIBj9MLDPgKUfPaX7Ci4EJBnYaSpNHhUQ";
//
        final Gson gson = new Gson();

        // Request a string response from the provided URL.
//        GsonRequest<PlacesResult> stringRequest = new GsonRequest<PlacesResult>(Request.Method.GET, url,
//                PlacesResult.class, null, null,
//                new Response.Listener<PlacesResult>() {
//                    @Override
//                    public void onResponse(PlacesResult response) {
//                        // Display the first 500 characters of the response string.
//                        mTextView.setText("Response is: " + response);
//                        Log.d("Place name", response.results.get(0).name);
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                mTextView.setText("That didn't work!");
//            }
//        });
        // Add the request to the RequestQueue.
        //queue.add(stringRequest);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
