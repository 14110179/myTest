package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.example.thanh.mytest_phungduythanh.Adapter.CustomAdapter2;
import com.example.thanh.mytest_phungduythanh.Adapter.CustomAdapter3;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Recipes extends Fragment {


    public Recipes() {
        // Required empty public constructor
    }
    private ListView listView;
    private ArrayList<dlRecipes> datas;
    private CustomAdapter3 customAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_recipes, container, false);
        duLieudatas();
        listView=(ListView)v.findViewById(R.id.listrecipes);
        customAdapter=new CustomAdapter3(getContext(),datas);
        listView.setAdapter(customAdapter);
        return v;
    }
    private void duLieudatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlRecipes("Curabitur lobor","6 minutes",R.drawable.hinh1));
        datas.add(new dlRecipes("Mauri non temp","20 minutes",R.drawable.hinh2));
        datas.add(new dlRecipes("In hac habitassse pla","30 minutes",R.drawable.hinh3));
        datas.add(new dlRecipes("Vestibulum rutr","40 minutes",R.drawable.hinh4));
    }
}
