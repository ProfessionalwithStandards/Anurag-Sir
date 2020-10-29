package com.example.myapplication;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WordAdapter extends ArrayAdapter<Word> {

    MediaPlayer mp = MediaPlayer.create(getContext(),R.raw.song);

    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context,0, words);
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemview = convertView;
        if(listitemview == null)
        {
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }


//        Button mbp = listitemview.findViewById(R.id.mb);
//
//
//        mbp.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//                    public void onClick(View v) {
//                        mbp.setBackgroundResource(android.R.drawable.ic_media_pause);
//
////                        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
////                            @Override
////                            public void onPrepared(MediaPlayer mp) {
//                                mp.start();
////                            }
////                        });
//                    }
//                });


        Word currentWord = getItem(position);

        TextView tv = listitemview.findViewById(R.id.tv);

        String s = currentWord.getDefaultranslation() + "\n\n" + currentWord.getTranslation1();

        tv.setText(s);


        ImageView iv = listitemview.findViewById(R.id.iv);
        if(currentWord.hasImage())
        {
            iv.setImageResource(currentWord.getmImageResId());
            iv.setVisibility(View.VISIBLE);

        }

        else
        {
            iv.setVisibility(View.GONE);
        }


        return listitemview;
    }
}
