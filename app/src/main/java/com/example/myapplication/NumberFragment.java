package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class NumberFragment extends Fragment {


    public NumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_number, container, false);

        MediaPlayer mp =  MediaPlayer.create(getContext(),R.raw.song);



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

        WordAdapter itemsAdapter = new WordAdapter(Objects.requireNonNull(getContext()),words);



        ListView listView = (ListView)getActivity().findViewById(R.id.listinnumber);

        listView.setAdapter(itemsAdapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//
//                Toast.makeText(getContext(), "List View Clicked", Toast.LENGTH_SHORT).show();
//
//
//            }
//        });

        return view;
    }
}