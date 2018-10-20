package com.example.escanor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.escanor.model.ListMenu;
import com.example.escanor.projectsaleflower.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListMenuAdapter extends BaseAdapter
{
    ArrayList<ListMenu> arrayListMnu;
    Context context;

    public ListMenuAdapter(ArrayList<ListMenu> arrayListMnu, Context context) {
        this.arrayListMnu = arrayListMnu;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayListMnu.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayListMnu.get(position);
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
            convertView=inflater.inflate(R.layout.item_menu,null);
            viewHolder.txttenmnu= (TextView) convertView.findViewById(R.id.txtMnu);
            viewHolder.imghinh= (ImageView) convertView.findViewById(R.id.imgMnu);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        ListMenu listMenu= (ListMenu) getItem(position);
        viewHolder.txttenmnu.setText(listMenu.getTenloai());
        Picasso.with(context).load(listMenu.getHinhanh()).into(viewHolder.imghinh);
        return convertView;
    }
}
