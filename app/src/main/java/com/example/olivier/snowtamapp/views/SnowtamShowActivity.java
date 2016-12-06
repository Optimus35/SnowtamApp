package com.example.olivier.snowtamapp.views;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

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

public class SnowtamShowActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {
    Snowtam snowtam;
    SnowtamRawFragment snowtamRawFragment;
    MapFragment mMapFragment;
    android.app.FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snowtam_show);
        try {
            getSnowtam();
            setFragments();
            setSpinner();
        } catch (JSONException e) {
            e.printStackTrace();
        }



    }

    private void getSnowtam() throws JSONException {
        SnowtamGenerator generator = new SnowtamGenerator(this);
        Intent intent = getIntent();
        String code = intent.getStringExtra(SNOWTAM_CODE);
        snowtam = generator.getSnowtam(code);
    }

    private void setFragments() {
        fragmentManager = getFragmentManager();
        //set mapFragment
        mMapFragment = MapFragment.newInstance();
        mMapFragment.getMapAsync(this);
        //set snotamRowfragment
        snowtamRawFragment = new SnowtamRawFragment();
        snowtamRawFragment.setSnowtam(snowtam);
        //show rawSnowtam
       FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(R.id.container, snowtamRawFragment);
        ft.commit();
    }

    private void setSpinner() {
        Spinner spinner = (Spinner) findViewById(R.id.spinnerView);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_choices, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    private void showRawSnowtamFragment() {
    FragmentTransaction ft  = fragmentManager.beginTransaction();
        ft.replace(R.id.container, snowtamRawFragment);
        ft.commit();
    }

    private void showMapFragment() {
     FragmentTransaction  ft = fragmentManager.beginTransaction();
        //set mapFragment

        ft.replace(R.id.container, mMapFragment);
        ft.addToBackStack(null);
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

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0 : showRawSnowtamFragment();break;
            case 1 : showMapFragment(); break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
