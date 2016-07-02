package com.example.android.miwok;

/**
 * Created by Nimish on 02-Jul-16.
 */

public class Word
{
    private String englishTranslation;
    private String miwokTranslation;

    public Word(String englishTranslation,String miwokTranslation)
    {
        this.englishTranslation=englishTranslation;
        this.miwokTranslation=miwokTranslation;
    }
    public  String getEnglish()
    {
        return englishTranslation;
    }
    public  String getMiwok()
    {
        return miwokTranslation;
    }


}
