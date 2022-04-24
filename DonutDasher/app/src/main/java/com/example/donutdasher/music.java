package com.example.donutdasher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class music extends AppCompatActivity {

    MediaPlayer mpMusic;
    int playing;
    Button musicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        musicButton = (Button)findViewById(R.id.btnMusic);
        mpMusic = new MediaPlayer().create(this, R.raw.song);
        playing = 0;

        musicButton.setOnClickListener(bsong);
    }
    Button.OnClickListener bsong = new Button.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch(playing) {
                case 0:
                    mpMusic.start();
                    playing = 1;
                    musicButton.setText("Pause Main Theme");
                    break;
                case 1:
                    mpMusic.pause();
                    playing = 0;
                    musicButton.setText("Play Main Theme");
                    break;
            }
        }
    };


}