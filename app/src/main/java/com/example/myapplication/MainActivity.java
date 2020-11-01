package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


Button mbp;
MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbp = findViewById(R.id.mb);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One" , "1",R.drawable.number_one,R.raw.song));
        words.add(new Word("Two" , "2",R.drawable.number_two,R.raw.song2));
        words.add(new Word("Three" , "3",R.drawable.number_three,R.raw.robot_voice_1_3));
        words.add(new Word("Four" , "4",R.drawable.number_four,R.raw.song));
        words.add(new Word("Five" , "5",R.drawable.number_five,R.raw.song));
        words.add(new Word("Six" , "6",R.drawable.number_six,R.raw.song));
        words.add(new Word("Seven" , "7",R.drawable.number_seven,R.raw.song));
        words.add(new Word("Eight" , "8",R.drawable.number_eight,R.raw.song));
        words.add(new Word("Nine" , "9",R.drawable.number_nine,R.raw.song));
        words.add(new Word("Ten" , "10",R.drawable.number_ten,R.raw.song));

        WordAdapter itemsAdapter = new WordAdapter(this,words);


//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


//                mbp.setBackgroundResource(android.R.drawable.ic_media_pause);
                Word w = words.get(position);
                releasemp();
                mp = MediaPlayer.create(MainActivity.this,w.getSong());



        //                        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
        //                            @Override
        //                            public void onPrepared(MediaPlayer mp) {


                                        mp.start();
//                                        if(mp.isPlaying())
//                                        {
//                                                            mbp.setBackgroundResource(android.R.drawable.ic_media_pause);
//                                        }
        //                            }
        //                        });
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
//                    Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT).show();

                    releasemp();

                }

            });
//                mbp.setBackgroundResource(android.R.drawable.ic_media_pause);

            }
        });

    }
    //kjjknknlkn
    //sdfskdhfsd

    private void releasemp() {

        if(mp!=null) {

            mp.release();
            mp = null;

        }


    }
}