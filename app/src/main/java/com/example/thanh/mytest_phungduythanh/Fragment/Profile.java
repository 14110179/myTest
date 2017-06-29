package com.example.thanh.mytest_phungduythanh.Fragment;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.thanh.mytest_phungduythanh.Adapter.CustomAdapter4;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.CSDL.dlProfile;
import com.example.thanh.mytest_phungduythanh.ExpandableHeightListView;
import com.example.thanh.mytest_phungduythanh.ImageConverter;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Profile extends Fragment {


    public Profile() {
        // Required empty public constructor
    }

    private ImageView imageView;
    private ExpandableHeightListView listView;
    private ArrayList<dlProfile> datas;
    private CustomAdapter4 customAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_profile, container, false);
        // Inflate the layout for this fragment
        /*Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.avatar);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 1000);

        ImageView circularImageView = (ImageView) v.findViewById(R.id.imageView);
        circularImageView.setImageBitmap(circularBitmap);*/
        duLieudatas();
        listView=(ExpandableHeightListView) v.findViewById(R.id.listProfile);
        customAdapter=new CustomAdapter4(getContext(),datas);
        listView.setAdapter(customAdapter);
        listView.setExpanded(true);

        return v;
    }
    private void duLieudatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlProfile("Vestibulum rutrum qu.","37 likes",R.drawable.hinh2));
        datas.add(new dlProfile("Nam porttitor blandi","15 likes",R.drawable.hinh3));
        datas.add(new dlProfile("In hac habitassse pla","7 likes",R.drawable.hinh4));
        datas.add(new dlProfile("Curabitur lobortis","55 likes",R.drawable.hinh2));
    }

}
