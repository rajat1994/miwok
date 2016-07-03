package com.example.android.miwok;

/**
 * Created by Nimish on 02-Jul-16.
 */

public class Word
{
    private String englishTranslation;
    private String miwokTranslation;
    private int imageResoruceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String englishTranslation,String miwokTranslation)
    {
        this.englishTranslation=englishTranslation;
        this.miwokTranslation=miwokTranslation;
    }

    public Word(String englishTranslation,String miwokTranslation, int imageResoruceId)
    {   this.imageResoruceId=imageResoruceId;
        this.englishTranslation=englishTranslation;
        this.miwokTranslation=miwokTranslation;
    }

    public  boolean hasImage()
    {
        return imageResoruceId!=NO_IMAGE_PROVIDED;
    }
    public  String getEnglish()
    {
        return englishTranslation;
    }
    public  String getMiwok()
    {
        return miwokTranslation;
    }
    public int getImageResoruceId()
    {
        return imageResoruceId;
    }


}
