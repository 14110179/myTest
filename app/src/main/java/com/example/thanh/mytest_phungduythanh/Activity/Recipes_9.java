package com.example.thanh.mytest_phungduythanh.Activity;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.example.thanh.mytest_phungduythanh.Fragment.Activity_;
import com.example.thanh.mytest_phungduythanh.Fragment.Home;
import com.example.thanh.mytest_phungduythanh.Fragment.Home2;
import com.example.thanh.mytest_phungduythanh.Fragment.Profile;
import com.example.thanh.mytest_phungduythanh.Fragment.Recipes;
import com.example.thanh.mytest_phungduythanh.Fragment.Settings;
import com.example.thanh.mytest_phungduythanh.R;

public class Recipes_9 extends AppCompatActivity {
    private RelativeLayout layout;
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_9);
        //layout = (RelativeLayout) findViewById(R.id.layout);
        Fragment f=new Home();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, f);
        transaction.commit();

        configureNavigationDrawer();
        configureToolbar();
    }
    private void configureToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setHomeAsUpIndicator(R.drawable.lines3);
        actionbar.setDisplayHomeAsUpEnabled(true);
    }

    private void configureNavigationDrawer() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        NavigationView navView = (NavigationView) findViewById(R.id.navigation);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                Fragment f = null;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.homes) {
                    f = new Home();
                }
                else if (itemId == R.id.homes2) {
                    f = new Home2();
                }
                else if (itemId == R.id.explore) {

                }
                else if (itemId == R.id.recipes) {
                    f = new Recipes();
                }
                else if (itemId == R.id.activity) {
                    f = new Activity_();
                }
                else if (itemId == R.id.settings) {
                    f = new Settings();
                }
                else if (itemId == R.id.profile) {
                    f = new Profile();
                }
                if (f != null) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame, f);
                    transaction.commit();
                    drawerLayout.closeDrawers();
                    return true;
                }

                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        switch(itemId) {
            // Android home
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;

            // manage other entries if you have it ...
        }

        return true;
    }
}
