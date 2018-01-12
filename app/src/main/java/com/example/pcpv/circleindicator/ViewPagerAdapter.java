package com.example.pcpv.circleindicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by PCPV on 01/12/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<ImageFragment> fragmentList;

    public ViewPagerAdapter(FragmentManager fm, List<ImageFragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
