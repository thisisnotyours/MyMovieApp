package com.suek.mymovieapp;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PreviewAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<ItemPreviews> item;

    public PreviewAdapter(Context context, ArrayList<ItemPreviews> item) {
        this.context = context;
        this.item = item;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
