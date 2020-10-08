package com.suek.mymovieapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    TabAdapter tabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        // Fragment/ Tab/ ViewPager
        tabLayout= findViewById(R.id.tab_layout);
        tabAdapter= new TabAdapter(getSupportFragmentManager());
        viewPager= findViewById(R.id.view_pager);
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);


        // Drawer Menu/ Navigation
        drawerLayout= findViewById(R.id.drawer_layout);
        navigationView= findViewById(R.id.nav);
        actionBarDrawerToggle= new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // 토글버튼 색 바꿔주기
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getColor(R.color.color_toggle));
        } else {
            actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.color_toggle));
        }

        출처: https://bluearoma.tistory.com/22 [BlueAroma]

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        Intent intentHome= new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intentHome);
                        break;

                    case R.id.tv_shows:
                        Intent intentTvShows= new Intent(MainActivity.this, TvShowsActivity.class);
                        startActivity(intentTvShows);
                        break;

                    case R.id.movies:
                        Intent intentMovies= new Intent(MainActivity.this, MovieActivity.class);
                        startActivity(intentMovies);
                        break;

                    case R.id.my_list:
                        Intent intentMyList= new Intent(MainActivity.this, MyListActivity.class);
                        startActivity(intentMyList);
                        break;

                    case R.id.setting:
                        Intent intentSetting= new Intent(MainActivity.this, SettingActivity.class);
                        startActivity(intentSetting);
                        break;

                }
                return true;
            }
        });


    }//onCreate..
}//Main class..
