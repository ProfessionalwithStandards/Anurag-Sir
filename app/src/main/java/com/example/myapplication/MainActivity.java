package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mp = MediaPlayer.create(this,R.raw.song);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One" , "1",R.drawable.number_one,mp));
        words.add(new Word("Two" , "2",R.drawable.number_two,mp));
        words.add(new Word("Three" , "3",R.drawable.number_three,mp));
        words.add(new Word("Four" , "4",R.drawable.number_four,mp));
        words.add(new Word("Five" , "5",R.drawable.number_five,mp));
        words.add(new Word("Six" , "6",R.drawable.number_six,mp));
        words.add(new Word("Seven" , "7",R.drawable.number_seven,mp));
        words.add(new Word("Eight" , "8",R.drawable.number_eight,mp));
        words.add(new Word("Nine" , "9",R.drawable.number_nine,mp));
        words.add(new Word("Ten" , "10",R.drawable.number_ten,mp));

        WordAdapter itemsAdapter = new WordAdapter(this,words);


//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(MainActivity.this, "List View Clicked", Toast.LENGTH_SHORT).show();


            }
        });




    }
}