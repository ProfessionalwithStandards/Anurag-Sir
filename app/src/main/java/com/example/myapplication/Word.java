package com.example.myapplication;

import android.media.MediaPlayer;
import android.provider.MediaStore;

public class Word {

    private String defaultranslation;
    private String translation1;
    private int mImageResId = -1;
    public static final int NO_IMAGE_FOUND = -1;
    public MediaPlayer mediaPlayer;
    private int song;

    public Word(String defaultranslation, String translation1) {
        this.defaultranslation = defaultranslation;
        this.translation1 = translation1;
    }

    public Word(String defaultranslation, String translation1, int mImageResId, MediaPlayer mediaPlayer) {
        this.defaultranslation = defaultranslation;
        this.translation1 = translation1;
        this.mImageResId = mImageResId;
        this.mediaPlayer = mediaPlayer;
    }
    public Word(String defaultranslation, String translation1, int mImageResId) {
        this.defaultranslation = defaultranslation;
        this.translation1 = translation1;
        this.mImageResId = mImageResId;
    }

    public Word(String defaultranslation, String translation1 , MediaPlayer mediaPlayer) {
        this.defaultranslation = defaultranslation;
        this.translation1 = translation1;
        this.mediaPlayer = mediaPlayer;
    }

    public Word(String defaultranslation, String translation1, int mImageResId, int song) {
        this.defaultranslation = defaultranslation;
        this.translation1 = translation1;
        this.mImageResId = mImageResId;
        this.song = song;
    }


    public MediaPlayer getM() {return mediaPlayer;}

    public int getmImageResId() {
        return mImageResId;
    }

    public String getDefaultranslation() {
        return defaultranslation;
    }

    public String getTranslation1() {
        return translation1;
    }

    public boolean hasImage()
    {
        return mImageResId != NO_IMAGE_FOUND;
    }

    public int getSong() { return song; }
}
