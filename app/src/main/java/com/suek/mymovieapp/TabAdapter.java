package com.suek.mymovieapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    Fragment[] fragments= new Fragment[3];
    String[] tabTitles= new String[]{"TV Shows","Movies","My List"};

    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments[0]= new FragmentTabTVShows();
        fragments[1]= new FragmentTabMovies();
        fragments[2]= new FragmentTabMyList();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
