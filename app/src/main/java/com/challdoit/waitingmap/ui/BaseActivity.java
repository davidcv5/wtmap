package com.challdoit.waitingmap.ui;

import android.app.Activity;

import com.challdoit.waitingmap.util.PlayServicesUtils;

/**
 * Created by David on 8/23/14.
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onResume() {
        super.onResume();

        // Verifies the proper version of Google Play Services exists on the device.
        PlayServicesUtils.checkGooglePlaySevices(this);

    }
}
