package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    private Button mbp;
    private MediaPlayer mp;
    private View convertview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

//        mp = MediaPlayer.create(Phrases.this,R.raw.song);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One" , "1",mp));
        words.add(new Word("Two" , "2"));
        words.add(new Word("Three" , "3"));
        words.add(new Word("Four" , "4"));
        words.add(new Word("Five" , "5"));
        words.add(new Word("Six" , "6"));
        words.add(new Word("Seven" , "7"));
        words.add(new Word("Eight" , "8"));
        words.add(new Word("Nine" , "9"));
        words.add(new Word("Ten" , "10"));

        WordAdapter itemsAdapter = new WordAdapter(this,words);


        mp = MediaPlayer.create(Phrases.this,R.raw.song);
//        mp.setAudioAttributes(
//                new AudioAttributes.Builder()
//                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
//                        .setUsage(AudioAttributes.USAGE_MEDIA)
//                        .build());
        ListView listView = findViewById(R.id.ll);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {


        });

        @NonNull ViewGroup parent = listView;
        convertview = LayoutInflater.from(getApplicationContext()).inflate(R.layout.list_item,parent,false);
        mbp = (Button)convertview.findViewById(R.id.mb);




//        AudioTrack myTrack = new AudioTrack(
//                new AudioAttributes.Builder()
//                        .setUsage(AudioAttributes.USAGE_MEDIA)
//                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
//                        .build(),
//                myFormat, myBuffSize, AudioTrack.MODE_STREAM, mySession);

            
//        mbp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mbp.setBackgroundResource(android.R.drawable.ic_media_pause);
//
//                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                    @Override
//                    public void onPrepared(MediaPlayer mp) {
//                        mp.start();
//                    }
//                });

//                if(mp == null)
//                {
//                    mp = MediaPlayer.create(Phrases.this,R.raw.song);
//                    mp.start();
//                   mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                       @Override
//                       public void onCompletion(MediaPlayer mp) {
//                           mp.release();
//                       }
//                   });
//                   mb.setBackgroundResource(android.R.drawable.ic_media_pause);
//                }

//                if (mp != null)
//                {
//                    mp.pause();
//                    mp.release();
//                    mp = null;
//                }
//            }
//        });
    }

}