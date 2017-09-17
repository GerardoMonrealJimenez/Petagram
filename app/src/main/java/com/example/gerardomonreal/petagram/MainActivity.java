package com.example.gerardomonreal.petagram;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import adapter.PageAdapter;
import java.util.ArrayList;

import fragments.MascotasFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    private TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar     = (Toolbar) findViewById(R.id.toolBar);
        viewPager   = (ViewPager) findViewById(R.id.viwePager);
        tabLayout   =   (TabLayout) findViewById(R.id.tabLayout);
        setSupportActionBar(toolbar);

        setUpViewPager();
    }

    private ArrayList<Fragment> agregandoFragments()
    {
        ArrayList<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(new MascotasFragment());

        return fragments;
    }

    public void setUpViewPager()
    {

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregandoFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_white_18dp);
    }
}
