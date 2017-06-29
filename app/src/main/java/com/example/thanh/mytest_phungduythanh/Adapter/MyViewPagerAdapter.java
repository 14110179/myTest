package com.example.thanh.mytest_phungduythanh.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.thanh.mytest_phungduythanh.Fragment.Layout_1;
import com.example.thanh.mytest_phungduythanh.Fragment.Layout_2;
import com.example.thanh.mytest_phungduythanh.Fragment.Layout_3;

/**
 * Created by THANH on 6/28/2017.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private static int NUM_ITEMS = 3;
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return Layout_1.newInstance(0, "Page # 1");
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return Layout_2.newInstance(1, "Page # 2");
            case 2: // Fragment # 1 - This will show SecondFragment
                return Layout_3.newInstance(2, "Page # 3");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
