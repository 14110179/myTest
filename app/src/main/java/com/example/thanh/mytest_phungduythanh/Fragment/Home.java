package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.thanh.mytest_phungduythanh.Adapter.CustomAdapter;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {


    public Home() {
        // Required empty public constructor
    }

    private ListView listView;
    private ArrayList<dlHome> datas;
    private CustomAdapter customAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        listView=(ListView)v.findViewById(R.id.lstHome);
        duLieudatas();
        customAdapter=new CustomAdapter(getContext(),datas);
        listView.setAdapter(customAdapter);
        // Inflate the layout for this fragment
        return v;
    }
    private void duLieudatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlHome("Strawberry & Cereals","Breakfast","344",R.drawable.hinh1,R.drawable.hinh1));
        datas.add(new dlHome("Salad Light","Lunch","157",R.drawable.hinh2,R.drawable.hinh2));
        datas.add(new dlHome("Honey","Breakfast","249",R.drawable.hinh4,R.drawable.hinh4));
        datas.add(new dlHome("Strawberry & Cereals","Breakfast","344",R.drawable.hinh3,R.drawable.hinh3));
    }
}
