public class MainActivity extends AppCompatActivity{
  AsyncNetworkTask task;
  String data = "NAME";

  @Override
  protected void onCreate(Bundle saveInstanceState){
    task.execute("http://tky.com/tmp/it/sample.php", data);
  }
}


