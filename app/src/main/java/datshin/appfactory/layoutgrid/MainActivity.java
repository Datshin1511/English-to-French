package datshin.appfactory.layoutgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void translateText(View view){
        Button buttonClicked = (Button) view;
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier("a"+buttonClicked.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setAlpha(0.0f);

        mediaPlayer = MediaPlayer.create(this, R.raw.xp);
        mediaPlayer.start();
        textView.animate().alpha(1f).setDuration(2000);

    }
}