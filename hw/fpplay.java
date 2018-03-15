try{
  mp = new MediaPlayer();
  mp.setDataSource(Environment.getExtrnalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getPath() + "/sample.mp3");
  mp.prepare();
  mp.start();
} catch (IllegalArgumentException | SecurityException |
  IOExceptoin | IllegalStateException e){
  e.printStackTrace();
}

