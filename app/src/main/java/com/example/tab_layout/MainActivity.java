package com.example.tab_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tab=findViewById(R.id.tab);
        pager=findViewById(R.id.pager);

        adapterF adapter=new adapterF(getSupportFragmentManager());
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);


    }
}