package com.example.eyedetectingvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    private LookAtMe lookAtMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lookAtMe = findViewById(R.id.lookme);
        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sample_video));
        //lookAtMe.setVideoPath("https://www.learningcontainer.com/mp4-sample-video-files-download/#"); //to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}