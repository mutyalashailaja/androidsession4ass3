package com.example.admin.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Admin on 15-10-2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public Integer[] mThumbIds = {
            R.drawable.images, R.drawable.honeycomb,
            R.drawable.kitkat, R.drawable.lollipop,
            R.drawable.icecreamsandwitch,R.drawable.jellybean
    };
    public ImageAdapter(Context c) {
         mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(350, 350));
        return imageView;
    }
}





