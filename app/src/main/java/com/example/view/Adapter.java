package com.example.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

    int []images;
    String[] movieName;
    String[] rating;
    Context context ;
    LayoutInflater inflater;

    Adapter(Context context, String[] movieName, int[] images,String[] rating){
        this.context=context;
        this.movieName=movieName;
        this.images=images;
        this.rating=rating;
    }


    @Override
    public int getCount() {
        return movieName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {

        if(convertview==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview= inflater.inflate(R.layout.sampleviewml,viewGroup,false);
        }

        TextView textView = convertview.findViewById(R.id.nameid);
        ImageView mimage = convertview.findViewById(R.id.imageid);
        TextView textView1 = convertview.findViewById(R.id.rate);
        textView.setText(movieName[i]);
        mimage.setImageResource(images[i]);
        textView1.setText(rating[i]);

        return convertview;

    }
}
