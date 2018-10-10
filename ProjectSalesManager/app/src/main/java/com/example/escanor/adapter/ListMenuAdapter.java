package com.example.escanor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.escanor.model.ListMenu;
import com.example.escanor.projectsalesmanager.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListMenuAdapter extends BaseAdapter
{
    ArrayList<ListMenu> arrayListLoaiSP;
    Context context;

    public ListMenuAdapter(ArrayList<ListMenu> arrayList,Context context)
    {
        this.arrayListLoaiSP=arrayList;
        this.context=context;
    }

    @Override
    public int getCount() {
        return arrayListLoaiSP.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayListLoaiSP.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder
    {
        TextView txttenmnu;
        ImageView imghinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder=null;
        if(convertView==null)
        {
            viewHolder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.mnu_loai,null);
            viewHolder.txttenmnu= (TextView) convertView.findViewById(R.id.textviewlaisp);
            viewHolder.imghinh= (ImageView) convertView.findViewById(R.id.imgloaimnu);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder= (ViewHolder) convertView.getTag();
            ListMenu listMenu= (ListMenu) getItem(position);
            viewHolder.txttenmnu.setText(listMenu.getTenloai());
            Picasso.with(context).load(listMenu.getHinhanh());
        }
        return null;
    }
}
