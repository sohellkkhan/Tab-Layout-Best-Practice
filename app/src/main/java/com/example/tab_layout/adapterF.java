package com.example.tab_layout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adapterF extends FragmentPagerAdapter {

    public adapterF(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public adapterF(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }


    @Override
    public Fragment getItem(int position) {

        if (position==0){
           return  new call();
        }else if (position==1){
            return new chat();
        }else {
            return new message();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return  "Chat";
        }else if (position==1){
            return "Status";
        }else {
            return "calls";
        }

       // return super.getPageTitle(position);
    }
}
