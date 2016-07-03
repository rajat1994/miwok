package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nimish on 02-Jul-16.
 */

public class WordAdapter extends ArrayAdapter<Word> {
     private int colorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words,int colorResourceId) {
        super(context, 0, words);
       this.colorResourceId=colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word w = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miowk_text);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(w.getMiwok());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(w.getEnglish());
        ImageView imageView=(ImageView)listItemView.findViewById(R.id.img);
        if(w.hasImage()) {
            imageView.setImageResource(w.getImageResoruceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);

                      int color = ContextCompat.getColor(getContext(), colorResourceId);

                      textContainer.setBackgroundColor(color);


        return listItemView;
    }

}
