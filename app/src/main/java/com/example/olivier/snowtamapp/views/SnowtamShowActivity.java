package com.example.olivier.snowtamapp.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.olivier.snowtamapp.R;
import com.example.olivier.snowtamapp.models.Snowtam;
import com.example.olivier.snowtamapp.models.SnowtamGenerator;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONException;

import static com.example.olivier.snowtamapp.views.CodeInputActivity.SNOWTAM_CODE;

public class SnowtamShowActivity extends AppCompatActivity implements OnMapReadyCallback {
    Snowtam snowtam;
    SnowtamRawFragment snowtamRawFragment;
    android.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            getSnowtam();
            setFragments();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        setContentView(R.layout.activity_snowtam_show);
    }

    private void getSnowtam() throws JSONException {
        SnowtamGenerator generator = new SnowtamGenerator(this);
        Intent intent = getIntent();
        String code = intent.getStringExtra(SNOWTAM_CODE);
        snowtam = generator.getSnowtam(code);
    }

    private void setFragments() {
        fragmentManager = getFragmentManager();
        snowtamRawFragment = new SnowtamRawFragment();
        snowtamRawFragment.setSnowtam(snowtam);
        android.app.FragmentTransaction ft = fragmentManager.beginTransaction();
        // ft.add(R.id.container, snowtamRawFragment);

        MapFragment mMapFragment = MapFragment.newInstance();
        mMapFragment.getMapAsync(this);

        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        //  googleMapOptions.camera(new CameraPosition(new LatLng(21 , 57),10,0,500));
        mMapFragment.newInstance();
        ft.add(R.id.container, mMapFragment);
        ft.commit();
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(50, 100), 5.0f));
        map.addMarker(new MarkerOptions()
                .zIndex(3)
                .position(new LatLng(50, 100))
                .title("Marker"));

    }
}
