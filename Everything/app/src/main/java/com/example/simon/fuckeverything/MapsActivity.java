package com.example.simon.fuckeverything;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        button1.findViewById(R.id.radioAZ);
        button1.bringToFront();
        button2.findViewById(R.id.radioCategory);
        button2.bringToFront();
        button3.findViewById(R.id.radioNearBy);
        button3.bringToFront();


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

//        button = new Button(findViewById(R.layout.activity_maps.));

        //button.OnClickListener
          //      @OnClick


        //}
        //}

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(34,-118), 9));


        makeMapFromDatabase();

        //test
        addMarkerToMap(new LatLng(34.01,-118.01),"Marker","describes af",0);
        makeMapFromDatabase();
        addMarkerToMap(new LatLng(34.1,-118.1),"Marker2","describes af2",1);
        addMarkerToMap(new LatLng(34,-118),"Marker","describes af",0);

    }

    void makeMapFromDatabase() {
        mMap.clear();
        //gets data from database and makes it into lists
        //use addMarkerList to get them on the map
    }

    void addMarkerList(ArrayList<LatLng> locations, ArrayList<String> names, ArrayList<String> descriptions,ArrayList<Integer> makers) {
        for (int i = 0; i < locations.size(); i++) {
            addMarkerToMap(locations.get(i), names.get(i), descriptions.get(i), makers.get(i));
        }
    }

    void addMarkerToMap(LatLng loc, String name, String description, int maker) {
        float color;

        // if maker is self
        color = BitmapDescriptorFactory.HUE_GREEN;
        // if maker is not self
        color = BitmapDescriptorFactory.HUE_BLUE;

        //test
        if (maker==0) {
            color = BitmapDescriptorFactory.HUE_GREEN;
        }

        mMap.addMarker(
                new MarkerOptions()
                        .position(loc)
                        .title(name)
                        .snippet(description)
                        .icon(BitmapDescriptorFactory.defaultMarker(color)));
    }

    void addMarkerToDatabase(LatLng loc, String name, String description) {
        //add Marker info to database
        //update map
    }
    void removeMarker(LatLng loc) {
        //remove Marker info from database
        //update map
    }

    public void userAdd() {
        //triggered by buttom

        //Some sort of interface
        //Gets data and adds to database

        makeMapFromDatabase();
    }



}
