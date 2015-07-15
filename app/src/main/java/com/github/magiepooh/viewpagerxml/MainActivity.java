package com.github.magiepooh.viewpagerxml;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        SmartTabLayout tab = (SmartTabLayout) findViewById(R.id.tab_main);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter.Builder(this)
                .add(FragmentPagerItem
                        .create("11111", MainFragment.class, MainFragment.createArgs(1)))
                .add(FragmentPagerItem
                        .create("222222", MainFragment.class, MainFragment.createArgs(2)))
                .add(FragmentPagerItem
                        .create("3333", MainFragment.class, MainFragment.createArgs(3)))
                .add(FragmentPagerItem
                        .create("44444", MainFragment.class, MainFragment.createArgs(4)))
                .add(FragmentPagerItem
                        .create("555555", MainFragment.class, MainFragment.createArgs(5)))
                .add(FragmentPagerItem
                        .create("66666", MainFragment.class, MainFragment.createArgs(6)))
                .build();

        viewPager.setAdapter(adapter);
        tab.setViewPager(viewPager);

        viewPager.setCurrentItem(3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
