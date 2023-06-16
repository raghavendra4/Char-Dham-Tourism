package com.example.tourism;

import  androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.tourism.databinding.ActivityMapsYamBinding;

import java.util.Vector;

public class MapsActivity_yam extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
private ActivityMapsYamBinding binding;

    MarkerOptions marker;
    LatLng location;

    Vector<MarkerOptions> markerOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityMapsYamBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        location =new LatLng(30.0668, 79.0193 );

        markerOptions = new Vector<>();

        markerOptions.add(  new MarkerOptions().title("yamunotri")
                .position(new LatLng(31.0140, 78.4600))
                .snippet("")
        );
        markerOptions.add(  new MarkerOptions().title("Gangotri")
                .position(new LatLng(30.9947, 78.9398))
                .snippet("approx. 227 kms from Yamunotri ")
        );

        markerOptions.add(  new MarkerOptions().title("Kedarnath")
                .position(new LatLng(30.7346, 79.0669))
                .snippet("approx. 387 kms distance from yamunotri")
        );
        markerOptions.add(  new MarkerOptions().title("Badrinath")
                .position(new LatLng(30.7433, 79.4938))
                .snippet("approx. 103 kms distance from yamunotri")
        );
        markerOptions.add(  new MarkerOptions().title("Rishikesh")
                .position(new LatLng(30.103368, 78.294754))
                .snippet("approx. 105 km distance from yamunotri")
        );
        markerOptions.add(  new MarkerOptions().title("Nainital")
                .position(new LatLng(29.3919, 79.4542))
                .snippet("approx 204 km distance from Yamunotri")
        );
        markerOptions.add(  new MarkerOptions().title("Kharsali")
                .position(new LatLng(30.9727, 78.4375))
                .snippet(" approx. 1 km from Yamunotri")
        );
        markerOptions.add(  new MarkerOptions().title("Hanuman Chatti")
                .position(new LatLng(30.9324, 78.3992))
                .snippet("open during Mco = 8am-6pm")
        );
        markerOptions.add(  new MarkerOptions().title("Dehradun Airport ")
                .position(new LatLng(30.195358754755826, 78.19201270769587))
                .snippet("approx.175  kms from Yamunotri ")
        );
        markerOptions.add(  new MarkerOptions().title("Janki Chatti")
                .position(new LatLng(30.9754, 78.4361))
                .snippet("open during Mco = 8am-6pm")
        );
        markerOptions.add(  new MarkerOptions().title("Bandarpunch ")
                .position(new LatLng(31.0267, 78.5719))
                .snippet("open during Mco = 8am-6pm")
        );
        markerOptions.add(  new MarkerOptions().title("Rishikesh Railway Station ")
                .position(new LatLng(30.10788534070834, 78.28801525520689))
                .snippet("approx. 211 kms from Yamunotri  ")
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

        // Add a marker in Sydney and move the camera
       // LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,8));
    }
}