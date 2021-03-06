package com.example.olivier.snowtamapp.models;

import android.app.Activity;

import com.google.android.gms.maps.model.LatLng;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chris on 03/12/2016.
 */

public class SnowtamGenerator {
    private Activity activity;
    private JSONObject snowtamListJSON;

    public SnowtamGenerator(Activity activity) {
        this.activity = activity;
        try {
            loadJSONFromAsset();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadJSONFromAsset() throws JSONException, IOException {
        String json = null;
        InputStream is = activity.getAssets().open("snowtamList.json");
        int size = is.available();
        byte[] buffer = new byte[size];
        is.read(buffer);
        is.close();
        json = new String(buffer, "UTF-8");
        snowtamListJSON = new JSONObject(json);
    }

    public Snowtam getSnowtam(String code) throws JSONException {
        JSONObject snowtamJSON = (JSONObject) snowtamListJSON.get(code);
        JSONObject gpsCoordinate = snowtamJSON.getJSONObject("gps");
        double lat = gpsCoordinate.getDouble("lat");
        double lng = gpsCoordinate.getDouble("lng");
        return new Snowtam(snowtamJSON.get("snowtam").toString(),lng,lat);
    }
}
