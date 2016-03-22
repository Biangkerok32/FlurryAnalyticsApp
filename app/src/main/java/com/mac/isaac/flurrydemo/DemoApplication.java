package com.mac.isaac.flurrydemo;

import android.app.Application;

import com.flurry.android.FlurryAgent;

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // configure Flurry
        FlurryAgent.setLogEnabled(true);

        // init Flurry
        FlurryAgent.init(this, this.getResources().getString(R.string.FLURRY_APP_ID));
    }
}