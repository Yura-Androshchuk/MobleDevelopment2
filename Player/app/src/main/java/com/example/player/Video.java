package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    VideoView videoPlayer;
    int state = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
    }

    public void play(View view){
        if(state!=0) {
            videoPlayer.start();
        }
        else  Toast.makeText(this, "Choose button", Toast.LENGTH_SHORT).show();
    }
    public void pause(View view){
        if(state!=0) {
            videoPlayer.pause();
        }
        else  Toast.makeText(this, "Choose button", Toast.LENGTH_SHORT).show();
    }
    public void stop(View view){
        if(state!=0) {
        videoPlayer.stopPlayback();
        videoPlayer.resume();
        }
        else  Toast.makeText(this, "Choose button", Toast.LENGTH_SHORT).show();
    }
    public void playFromWeb(View view)
    {
        state = 1;
        final EditText editText = (EditText) findViewById(R.id.editText);
        String tText = editText.getText().toString();
        if (tText.matches("")) {
            Toast.makeText(this, "Enter path", Toast.LENGTH_SHORT).show();
            //tText ="http://video.ch9.ms/ch9/507d/71f4ef0f-3b81-4d2c-956f-c56c81f9507d/AndroidEmulatorWithMacEmulator.mp4";
            //videoPlayer = (VideoView) findViewById(R.id.videoPlayer);
            //videoPlayer.setVideoPath(tText);
            return;
        }
        else {

            videoPlayer = (VideoView) findViewById(R.id.videoPlayer);
            videoPlayer.setVideoPath(tText);
        }
    }
    public void playDefault(View view)
    {
        state = 2;
        videoPlayer =  (VideoView)findViewById(R.id.videoPlayer);
        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.video);
        videoPlayer.setVideoURI(myVideoUri);
    }
}


