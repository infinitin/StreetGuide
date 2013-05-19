package com.example.StreetGuide;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private GoogleMap mMap;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

}
