package com.feistymoon.mytracks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Use a list of tracks
    ArrayList<AudioTrack> tracks = new ArrayList<AudioTrack>();
    TextView lastTrackTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastTrackTextView = (TextView)findViewById(R.id.textview_last_added);

        // Adds a track
        tracks.add(new AudioTrack("Shine on you crazy diamond", "Pink Floyd", "Wish you were here", 0.99));
        // Adds a track
        tracks.add(new AudioTrack("Time", "Pink Floyd", "Time", 0.99));
        // Adds a track
        tracks.add(new AudioTrack("Another Brick In The Wall", "Pink Floyd", "Another Brick In The Wall", 0.99));
        //Display the track
        showLastTrackAdded();

    }

    // This will display the last track that was added
    private void showLastTrackAdded() {

        for(AudioTrack tr : tracks)
        {
            lastTrackTextView.setText(getString(R.string.string_last_track) + tracks.get(tracks.size() - 1).toString());
        }

        // Above statement is equivalent to
        /*
        int index = tracks.size()-1;
        AudioTrack a = tracks.get(index);
        String output = a.toString();
        lastTrackTextView.setText(output);
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
