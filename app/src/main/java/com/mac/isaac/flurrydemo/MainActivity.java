package com.mac.isaac.flurrydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.flurry.android.FlurryAgent;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // starts current session
        FlurryAgent.onStartSession(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        // ends current session
        FlurryAgent.onEndSession(this);
    }

    public void registerClickEvent(View view) {
        Map<String, String> eventParams = new HashMap<String, String>();

        //param keys and values have to be of String type
        eventParams.put("event", "click");
        eventParams.put("value", "test");

        //up to 10 params can be logged with each event
        FlurryAgent.logEvent("button is clicked", eventParams);
        Toast.makeText(this, "Flurry Event Tracked", Toast.LENGTH_SHORT).show();
    }
}
