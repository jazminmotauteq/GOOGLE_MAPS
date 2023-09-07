package com.example.Google_Maps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.Google_Maps.MyInfoWindowAdapter;
import com.example.googlemaps_marcadoresconinterfaz.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class MyInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
    private final View mWindow;

    public MyInfoWindowAdapter(Context context) {
        mWindow = LayoutInflater.from(context).inflate(R.layout.custom_info_window, null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        TextView title = mWindow.findViewById(R.id.title3);
        TextView snippet = mWindow.findViewById(R.id.snippet4);
        title.setText(marker.getTitle());
        snippet.setText(marker.getSnippet());
        return mWindow;
    }


    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }


}
