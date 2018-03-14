package com.tky.mapmylocation;

import android.content.pm.PackageManager;
import android.location.Location;
import android.android.os.Bubble;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class MapsActivity extends FragmentActivity
  implements OnMapReadyCallback,
  GoogleApiClient.ConnectionCallbacks,
  GoogleApiClient.ConnectionFailedListener, LocationListener{
  private GoogleApiClient client;
  private Locationrequest request;
  private FusedLocationProviderApi api;
  private GoogleMap mMap;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);

    if(ActivityCompat.checkSelfPermission(this,
	android.Manifest.permission.ACCESS_FILE_LOCATION)
	!= PackageManager.PERMISSION_GRANTED){
	ActivityCompat.requestPermissions(this,
	  new String[]{android.Manifest.permission.ACCESS_FILE_LOCATION}, 1);
	}

    SupportMapFragment mapFragment = (SupportMapFragment)
	    getSupportFragmentManager().findFragmentById(R.id.map);
    mapFragment.getMapAsync(this);

    request = LocationRequest.create()
	    .setPriotiry(LocationRequest.PRIORITY_HIGH_ACCURACY)
	    .setInterval(1000)
	    .setFastestInterval(15);
    api = LocationServices.FusedLocationApi;

    client = new GoogleApiClient.Builder(this)
	    .addApi(LocationServices.API)
	    .addConnectionCallback(this)
	    .addConnectionFailedListener(this)
	    .build();
  }

  @Override
  public void onMapReady(GoogleMap googleMap){
    mMap = googleMap;

    LatLng current = new LatLng(35.670292, 139.773006);
    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(current, 16f));
  }

  @Override
  protected void onResume(){
    super.onResume();

    if(client != null){
      client.connect();
    }
  }

  @Override
  protected void onPause(){
    super.onPause();
    if(client != null && client.isConnected()){
      api.removeLocationUpdates(client, this);
    }
    client.disconnect();
  }

  @Override
  public void onConnected(Bundle bundle){
    if(ActivityCompat.checkSelfPermission(this, android.Manifest.
	permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
	  return;
	}

        api.requestLocationUpdates(client, request, this);
  }

//  @Override
//  public void onMapReady(GoogleMap googleMap){
//    mMap = googleMap;
//
//      LatLng sydney = new LatLng(-34, 151);
//      mMap.addMarker(new MarkerOptions()
//	.position(sydney).title("Marker in Sydney"));
//      
//      mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//      mMap.getUiSettings().setZoomControlsEnabled(true);
//    }
//
//    public void btnSatellite_onClick(View view){
//      mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
//    }
//
//    public void btnNormal_onClick(View view){
//      mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//    }
//  }
  @Override
  public void onConnectionSuspended(int i){
  }

  @Override
  public void onConnectionFailed(ConnectionResult connectionResult){
  }

  @Override
  public void onLocationChanged(Location location){
    if(mMap == null) { return; }
    LatLng current = new LatLng(
      location.getLatLatitude(), location.getLongitude());
    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(current, 16f));
  }
}


