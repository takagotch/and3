String msg = "CHECK ON" + pref.getBoolean("chk", true);

String msg = "CHECK ON" + pref.getBoolean("switch", true);

String msg = "BLOOD_ITEMS" + pref.getString("list", "A");

String msg = "OS: ";
Set<String> set = pref.getStringSet("multi", new HashSet<String>());
for(String str: set){
  msg += str + " ";
}

String url = pref.getString("sound", "");
if(url != ""){
  MediaPlayer mp = MediaPlayer.create(this, Uri.parse(url));
  mp.start();
}

String msg = "USER" + pref.getString("edittext_name", "NULL");
msg += "\nBLOOD_ITEMS" + pref.getString("list", "A");
msg += "\nCHECK" + pref.getBoolean("chk", true);

