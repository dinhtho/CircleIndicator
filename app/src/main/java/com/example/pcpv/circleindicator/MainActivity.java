package com.example.pcpv.circleindicator;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.rd.PageIndicatorView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        List<ImageFragment> fragmentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            fragmentList.add(ImageFragment.newInstance(R.drawable.ic_launcher_background));
        }
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(viewPagerAdapter);

        setPageIndicator(viewPager);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.i(TAG, "onPageScrolled: " + position);
            }

            @Override
            public void onPageSelected(int position) {
                Log.i(TAG, "onPageSelected: " + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.i(TAG, "onPageScrollStateChanged: " + state);
            }
        });

    }

    private void setPageIndicator(ViewPager viewPager) {
        PageIndicatorView pageIndicatorView = findViewById(R.id.pageIndicatorView);
        pageIndicatorView.setViewPager(viewPager);
    }

    private void setFragmentShown(ViewPager viewPager, int index) {
        viewPager.setCurrentItem(index);
    }

    private int getCurrentFragmentShown(ViewPager viewPager) {
        return viewPager.getCurrentItem();
    }

    private void disableSwipeInViewPager(ViewPager viewPager) {
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                // override onTough feature
                return true;
            }
        });
    }

}
