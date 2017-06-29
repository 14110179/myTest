package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlHome;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 6/28/2017.
 */

public class CustomAdapter2 extends BaseAdapter {
    private Context context;
    private ArrayList<dlHome2> datas;
    private LayoutInflater layoutInflater;
    public CustomAdapter2(Context context,ArrayList<dlHome2> datas)
    {
        this.context=context;
        this.datas=datas;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return datas!=null?datas.size():0;
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomAdapter2.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new CustomAdapter2.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_gridview,null);
            viewHolder.txtName1= (TextView) convertView.findViewById(R.id.txtgrid1);
            viewHolder.txtName2= (TextView) convertView.findViewById(R.id.txtgrid2);
            viewHolder.txtName3=(TextView)convertView.findViewById(R.id.txtgrid3);
            viewHolder.imgImage=(ImageView)convertView.findViewById(R.id.imggrid);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(CustomAdapter2.ViewHolder)convertView.getTag();
        }
        dlHome2 item=(dlHome2)getItem(position);

        viewHolder.txtName1.setText(item.getTxtName1());
        viewHolder.txtName2.setText(item.getTxtName2());
        viewHolder.txtName3.setText(item.getTxtName3());
        viewHolder.imgImage.setImageResource(item.getUrlAvatar());
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName1;
        private TextView txtName2;
        private TextView txtName3;
        private ImageView imgImage;
    }
}
