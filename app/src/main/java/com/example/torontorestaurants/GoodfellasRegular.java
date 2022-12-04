package com.example.torontorestaurants;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoodfellasRegular extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodfellas_regular);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng goodfellas = new LatLng(43.6482196, -79.4887328);
        mMap.addMarker(new MarkerOptions().position(goodfellas).title("Goodfellas Wood Oven Pizza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(goodfellas,15));
        mMap.setMapType(mMap.MAP_TYPE_NORMAL);

    }
}