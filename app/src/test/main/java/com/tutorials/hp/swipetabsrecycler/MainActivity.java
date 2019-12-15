package com.tutorials.hp.swipetabsrecycler;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.tutorials.hp.swipetabsrecycler.Fragments.CrimeFragment;
import com.tutorials.hp.swipetabsrecycler.Fragments.DocumentaryFragment;
import com.tutorials.hp.swipetabsrecycler.Fragments.DramaFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ViewPager vp= (ViewPager) findViewById(R.id.mViewpager_ID);
        this.addPages(vp);

        TabLayout tabLayout= (TabLayout) findViewById(R.id.mTab_ID);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(listener(vp));


    }

    //ADD ALL PAGES
    private void addPages(ViewPager pager)
    {
        MyFragPagerAdapter adapter=new MyFragPagerAdapter(getSupportFragmentManager());
        adapter.addPage(new CrimeFragment());
        adapter.addPage(new DramaFragment());
        adapter.addPage(new DocumentaryFragment());

        //SET ADAPOTER TO PAGER
        pager.setAdapter(adapter);
    }

    private TabLayout.OnTabSelectedListener listener(final ViewPager pager)
    {
        return new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
    }

}
