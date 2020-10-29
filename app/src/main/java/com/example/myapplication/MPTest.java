package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MPTest extends AppCompatActivity {

    Button p,pa;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_p_test);

        p = findViewById(R.id.p);
        pa = findViewById(R.id.pa);

        mp = MediaPlayer.create(this,R.raw.song);


    }

    public void p(View view) {
        mp.start();
    }

    public void pa(View view) {
        mp.stop();
        mp.release();

    }
}