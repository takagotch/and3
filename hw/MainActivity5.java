import android.content.Context;
import android.media.AudioManager;

import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity{
  Button btnPaly;
  AudioManager am;
  MediaPlayer mp;
  
  @Override
  protected void onCreate(Bundle savedInstanceState){
    am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    am.setStreamVolume(AudioManager.STREAM_MUSIC, 5, 0);

    SeekBar sb = (SeekBar) findViewById(R.id.seek);
    sb.setOnSeekBarChangeListener(
	new SeekBar.OnSeekBarChangeListener(){
	  public void onProgressChanged(
		SeekBar sb, int progress, boolean fromUser){
		am.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
	  }
	  public void onStartTrackingTouch(SeekBar sb){ }
	  public void onStopTrackingTouch(SeekBar sb){ }
	}
    );
    btnPlay = (Button) findViewById(R.id.btnPaly);
  }
}


