//onRequestPermissionsResult
public void onRequestPermissionResult(int code, String[] perms, int[] results)

@Override
public void onRequestPermissionResult(int code, String[] perms, int[] results){
  if(code == 1 && results[] == PackageManager.PERMISSION_GRANTED){
  }
}


//requestPermission
public static void requestPermissions(Activity activity,
  String[] perms, int code)

//checkSelfPermission
public static int checkSelfPermission(Context context, String perm)

//






//vibrate
public void vibrate(long milliseconds)
public void vibrate(long[] pattern, int repeat)

v.vibrate(new long[] { 1000, 500, 1000, 500, 2000, 500 }, -1);


