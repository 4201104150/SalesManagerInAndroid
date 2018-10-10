package com.example.escanor.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.escanor.model.ThongTinSanPham;
import com.example.escanor.projectsalesmanager.R;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ThongTinSanPhamAdapter extends BaseAdapter
{
    ArrayList<ThongTinSanPham> arrayListLoaiSP;
    Context context;

    public ThongTinSanPhamAdapter(ArrayList<ThongTinSanPham> arrayListLoaiSP, Context context)
    {
        this.arrayListLoaiSP = arrayListLoaiSP;
        this.context = context;
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

    public class ViewHolder
    {
        TextView txtThongTinSP;
        TextView txtGiaGoc;
        TextView txtGiaKhuyenMai;
        TextView txtNhaCungCap;
        TextView txtTrangThai;
        ImageView imvHinhAnh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder=null;
        if(convertView==null)
        {
            viewHolder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.items_commodity,null);

            viewHolder.imvHinhAnh= (ImageView) convertView.findViewById(R.id.imvHinhAnh);
            viewHolder.txtThongTinSP= (TextView) convertView.findViewById(R.id.txtThongTinSP);
            viewHolder.txtGiaGoc= (TextView) convertView.findViewById(R.id.txtGiaGoc);
            viewHolder.txtGiaKhuyenMai= (TextView) convertView.findViewById(R.id.txtGiaKhuyenMai);
            viewHolder.txtNhaCungCap= (TextView) convertView.findViewById(R.id.txtNhaCungCap);
            viewHolder.txtTrangThai= (TextView) convertView.findViewById(R.id.txtTrangThai);

            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder  = (ViewHolder) convertView.getTag();
        }
        DecimalFormat decimalFormat=new DecimalFormat("###,###");
        ThongTinSanPham thongTinSanPham= (ThongTinSanPham) getItem(position);
        viewHolder.txtThongTinSP.setText(thongTinSanPham.getChiTiet());
        viewHolder.txtGiaGoc.setText(thongTinSanPham.getGiaBan());
        viewHolder.txtTrangThai.setText(thongTinSanPham.getTrangThai());
        viewHolder.txtNhaCungCap.setText(thongTinSanPham.getNhaPhanPhoi());
        viewHolder.txtGiaKhuyenMai.setText(thongTinSanPham.getGiaKhuyenMai());

        Picasso.with(context).load(thongTinSanPham.getHinhAnh()).placeholder(R.drawable.iconloading).error(R.drawable.iconerror).into(viewHolder.imvHinhAnh);
        return convertView;
    }
}
