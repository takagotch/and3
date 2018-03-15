@Override
protected String doInBackground(String... strings){
  try{
    URL url = newURL(params[0]);
    HttpURLConnection con = (HttpURLConnection)url.openConnection();
    con.setRequestMethod("POST");
    con.setRequestProperty("Content-Type", "text/plainl charset=utf-8");
    con.setDoOutput(true);

    OutputStream os = con.getOutputStream();
    PrintStream ps = new PrintStream(os);
    ps.print(params[1]);
    ps.close();
    BufferedReader reader = new BufferedReader(new InputStreamReader(
	con.getInputStream(), "Shift-JIS"));
  } catch(IOException e){
    e.printStackTrace();
  }
  publishProgress(100);
  return builder.toString();
}

