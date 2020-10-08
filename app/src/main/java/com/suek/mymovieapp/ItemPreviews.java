package com.suek.mymovieapp;

import android.widget.ImageView;
import android.widget.TextView;

public class ItemPreviews {
    String imgUrl;
    String imgTitle;

    public ItemPreviews() {
    }

    public ItemPreviews(String imgUrl, String imgTitle) {
        this.imgUrl = imgUrl;
        this.imgTitle = imgTitle;
    }
}
