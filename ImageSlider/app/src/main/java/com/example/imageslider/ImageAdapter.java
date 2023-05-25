package com.example.imageslider;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageAdapter extends PagerAdapter {
    Context mContext;
    ImageAdapter(Context context) {
        this.mContext = context;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }
    private int[] sliderImageId = new int[]{
            R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2,R.drawable.sample_3, R.drawable.sample_4,
    };
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }
    @Override
    public int getCount() {
        return sliderImageId.length;
    }
}
