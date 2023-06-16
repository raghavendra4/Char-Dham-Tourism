package com.example.tourism;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.tourism.databinding.ActivityMapsKedBinding;

import java.util.Vector;

public class MapsActivity_ked extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsKedBinding binding;

    MarkerOptions marker;
    LatLng location;

    Vector<MarkerOptions> markerOptions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsKedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        location =new LatLng(30.0668, 79.0193 );

        markerOptions = new Vector<>();

        markerOptions.add(  new MarkerOptions().title("yamunotri")
                .position(new LatLng(31.0140, 78.4600))
                .snippet("Approx 387 kms from kedarnath")
        );
        markerOptions.add(  new MarkerOptions().title("Gangotri")
                .position(new LatLng(30.9947, 78.9398))
                .snippet("Approx 408 kms from kedarnath  ")
        );
        markerOptions.add(  new MarkerOptions().title("Badrinath")
                .position(new LatLng(30.7433, 79.4938))
                .snippet("approx. 218 kms distance from kedarnath")
        );

        markerOptions.add(  new MarkerOptions().title("Kedarnath")
                .position(new LatLng(30.7346, 79.0669))
                .snippet("")
        );
        markerOptions.add(  new MarkerOptions().title("Gauri kund ")
                .position(new LatLng(30.6529 , 79.0257))
                .snippet("Approx 16 kms from kedarnath ")
        );
        markerOptions.add(  new MarkerOptions().title("Bhairav Nath ")
                .position(new LatLng(30.7321, 79.0702))
                .snippet("Approx 0.8 kms from kedarnath")
        );
        markerOptions.add(  new MarkerOptions().title("vasuki Tal ")
                .position(new LatLng(30.90836356, 79.17344193))
                .snippet("Approx 40 kms from kedarnath")
        );
        markerOptions.add(  new MarkerOptions().title("Wildlife Sanctuary ")
                .position(new LatLng(30.7534, 79.0645 ))
                .snippet("Approx 3 kms from kedarnath")
        );
        markerOptions.add(  new MarkerOptions().title("Rishikesh Railway Station ")
                .position(new LatLng(30.10788534070834, 78.28801525520689))
                .snippet("approx. 254 kms from Kedarnath   ")
        );
        markerOptions.add(  new MarkerOptions().title("Dehradun Airport ")
                .position(new LatLng(30.195358754755826, 78.19201270769587))
                .snippet("approx.254   kms from Kedarnath ")
        );

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

        for(MarkerOptions mark : markerOptions) {

            mMap.addMarker(mark);
        }


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,8));
    }
}