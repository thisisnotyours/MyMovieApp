package com.suek.mymovieapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentTabTVShows extends Fragment {

    ArrayList<ItemPreviews> itemPreviews= new ArrayList<>();
    PreviewAdapter previewAdapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view= inflater.inflate(R.layout.fragment_tab_tvshows, container, false);

        //Recyclerview for Previews
        itemPreviews.add(new ItemPreviews("https://images-na.ssl-images-amazon.com/images/I/91zJ-YXNsIL._SL1500_.jpg", "The FALL"));

        recyclerView= view.findViewById(R.id.recyclerview);
        previewAdapter= new PreviewAdapter();
        recyclerView.setAdapter(previewAdapter);

        return view;


    }//onCreateView..
}
