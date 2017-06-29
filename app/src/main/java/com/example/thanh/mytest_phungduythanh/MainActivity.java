package com.example.thanh.mytest_phungduythanh;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.Activity.Tab_Login;
import com.example.thanh.mytest_phungduythanh.Activity.Tab_SignUp;

import java.util.HashMap;

public class MainActivity extends TabActivity {

    private TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabHost=(TabHost)findViewById(android.R.id.tabhost);
        mTabHost.getTabWidget().setDividerDrawable(null);



        TabHost.TabSpec TabLogin = mTabHost.newTabSpec("Tab Login");
        TabHost.TabSpec TabSignUp = mTabHost.newTabSpec("Tab SignUp");


        TabLogin.setIndicator("LOGIN");
        TabLogin.setContent(new Intent(this,Tab_Login.class));

        TabSignUp.setIndicator("SINGUP");
        TabSignUp.setContent(new Intent(this,Tab_SignUp.class));


        mTabHost.addTab(TabLogin);
        mTabHost.addTab(TabSignUp);
    }

}
