public class MapsActivity extends FragmentActivity
  implements OnMapReadyCallback{
  private Google mMap;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);

    SupportMapFragment mapFragment =
	    (SupportMapFragment) getSupportFragmentManager()
	    .findFragmentById(R.id.map);
    mapFragment.getMapAsync(this);

    @Override
    public void onMapReady(GoogleMap googleMap){
      mMap = googleMap;

      LatLng sydney = new LatLng(-34, 151);
      mMap.addMarker(new MarkerOptions()
	.position(sydney).title("Marker in Sydney"));
      
      mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
  }
}


