package com.example.hackthonproject;

import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
/**
 * @author Priyanka
 */

class GetNearbyPlacesData extends AsyncTask<Object, String, String> {

    private String googlePlacesData;
    private GoogleMap mMap;
    String url;

    @Override
    protected String doInBackground(Object... objects){
        mMap = (GoogleMap)objects[0];
        url = (String)objects[1];

        com.example.hackthonproject.DownloadURL downloadURL = new com.example.hackthonproject.DownloadURL ();
        try {
            googlePlacesData = downloadURL.readUrl(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return googlePlacesData;
    }

    @Override
    protected void onPostExecute(String s){

        List<HashMap<String, String>> nearbyPlaceList;
        com.example.hackthonproject.DataParser parser = new com.example.hackthonproject.DataParser ();
        nearbyPlaceList = parser.parse(s);
        Log.d("nearbyplacesdata","called parse method");
        showNearbyPlaces(nearbyPlaceList);
    }

    private void showNearbyPlaces(List<HashMap<String, String>> nearbyPlaceList)
    {
        for(int i = 0; i <=0; i++)
        {
            MarkerOptions markerOptions = new MarkerOptions();
            HashMap<String, String> googlePlace = nearbyPlaceList.get(i);
            String placeName = googlePlace.get("place_name");
            double lat = Double.parseDouble("12.974085");
            double lng = Double.parseDouble("80.137627");
            LatLng latLng = new LatLng( lat, lng);
            markerOptions.position(latLng);
            markerOptions.position(latLng);
            markerOptions.title(placeName);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            double lat1 = Double.parseDouble("17.689608");
            double lng1 = Double.parseDouble("83.232522");
            LatLng latLng1 = new LatLng( lat1, lng1);
            markerOptions.position(latLng1);
            markerOptions.title("Charity");
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng1));
            double lat2 = Double.parseDouble("17.804403");
            double lng2 = Double.parseDouble("83.365208");
            LatLng latLng2 = new LatLng( lat2, lng2);
            markerOptions.position(latLng2);
            markerOptions.title(placeName);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng2));
            double lat3 = Double.parseDouble("17.715548");
            double lng3 = Double.parseDouble("83.299332");
            LatLng latLng3 = new LatLng( lat3, lng3);
            markerOptions.position(latLng3);
            markerOptions.title(placeName);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng3));
            double lat4 = Double.parseDouble("17.724664");
            double lng4 = Double.parseDouble("83.284405");
            LatLng latLng4 = new LatLng( lat4, lng4);
            markerOptions.position(latLng4);
            markerOptions.title(placeName);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng4));
            double lat5 = Double.parseDouble("17.743935");
            double lng5 = Double.parseDouble("83.228661");
            LatLng latLng5 = new LatLng( lat5, lng5);
            markerOptions.position(latLng5);
            markerOptions.title(placeName);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng5));
            double lat6 = Double.parseDouble("17.747549");
            double lng6 = Double.parseDouble("83.262334");
            LatLng latLng6 = new LatLng( lat6, lng6);
            markerOptions.position(latLng6);
            markerOptions.title(placeName);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng6));
            double lat7 = Double.parseDouble("17.731255");
            double lng7 = Double.parseDouble("83.304145");
            LatLng latLng7 = new LatLng( lat7, lng7);
            markerOptions.position(latLng7);
            markerOptions.title(placeName);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng7));
            double lat8 = Double.parseDouble("17.715743");
            double lng8 = Double.parseDouble("83.315804");
            LatLng latLng8 = new LatLng( lat8, lng8);
            markerOptions.position(latLng8);
            markerOptions.title(placeName);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng8));
            double lat9 = Double.parseDouble("17.727578");
            double lng9 = Double.parseDouble("83.301675");
            LatLng latLng9 = new LatLng( lat9, lng9);
            markerOptions.position(latLng9);
            markerOptions.title(placeName);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng9));
            //mMap.animateCamera(CameraUpdateFactory.zoomTo(10));
        }
    }
}
