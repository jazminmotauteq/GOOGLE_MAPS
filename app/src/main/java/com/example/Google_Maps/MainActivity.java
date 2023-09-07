package com.example.Google_Maps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.Google_Maps.MainActivity;
import com.example.googlemaps_marcadoresconinterfaz.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener {
    GoogleMap Mapas;

    public TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        Mapas=googleMap;
        Mapas.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        LatLng ltBF= new LatLng(-1.0096356845321794, -79.46898125605784);


        //Activar los controles del Zoom
        Mapas.getUiSettings().setZoomControlsEnabled(true);


        CameraUpdate camUpdBF= CameraUpdateFactory.newLatLngZoom(ltBF,15);
        Mapas.moveCamera(camUpdBF);

        LatLng Shopping = new LatLng(-1.0096356845321794, -79.46898125605784);
        Mapas.addMarker(new MarkerOptions().position(Shopping).title("Paseo Shopping Quevedo").snippet(String.valueOf("Paseo Shopping Quevedo"+
                "                          Transversal Central"+
                "Quevedo" +
                " Domingo a Jueves"+
                " Locales e Islas 10h00 - 21h00 " +
                "Patio de comidas y Fun Zone 10h00 - 22h00"+
                " Viernes a Sábado"+
                "Locales e Islas 10h00 - 22h00 " +
                "Patio de comidas y Fun Zone 10h00 - 23h00"
        )).icon(BitmapDescriptorFactory.fromResource(R.drawable.shop)).anchor(0.1f,0.1f));

        LatLng Police = new LatLng(-1.0108540712491765, -79.46645758462383);
        Mapas.addMarker(new MarkerOptions().position(Police).title("Quevedo Policia Nacional").snippet(String.valueOf(" Policia Nacional"+
                "  Transversal Central"+
                "  Frente al Paseo Shopping Quevedo "
        )).icon(BitmapDescriptorFactory.fromResource(R.drawable.police)).anchor(0.1f,0.1f));


        LatLng hotel = new LatLng(-1.014032194181326, -79.46931960182172);
        Mapas.addMarker(new MarkerOptions().position(hotel).title("Hotel Golden").snippet(String.valueOf(" Hotel Golden"+
                "                          DIRECCION: Gustavo Chongqui 202"+
                        " Código Postal: 120501"
                +"Quevedo, Ecuador"+
                "SERVICIOS:WiFi gratuita, aire acondicionado y TV de pantalla plana."+
                "HORARIO DE ATENCION: Las 24 horas"
        )).icon(BitmapDescriptorFactory.fromResource(R.drawable.hotel)).anchor(0.1f,0.1f));

        Mapas.setInfoWindowAdapter(new MyInfoWindowAdapter(this));
        }
    @Override
    public void onMapClick(@NonNull LatLng latLng) {

    }

}




