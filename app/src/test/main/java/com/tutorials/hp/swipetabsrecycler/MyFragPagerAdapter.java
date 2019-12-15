package com.tutorials.hp.swipetabsrecycler;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Hp on 3/23/2016.
 */
public class MyFragPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> pages=new ArrayList<>();

    public MyFragPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return pages.get(position);
    }

    @Override
    public int getCount() {
        return pages.size();
    }

    //ADD A PAGE
    public void addPage(Fragment f)
    {
        pages.add(f);
    }

    //SET TITLE FOR TAB

    @Override
    public CharSequence getPageTitle(int position) {
        return pages.get(position).toString();
    }
}
