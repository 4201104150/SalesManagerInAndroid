package com.example.escanor.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.escanor.model.SanPham;
import com.example.escanor.projectsaleflower.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ListSanPhamAdapter extends BaseAdapter
{
    Context context;
    ArrayList<SanPham> arrSanPham;

    public ListSanPhamAdapter(Context context, ArrayList<SanPham> arrSanPham) {
        this.context = context;
        this.arrSanPham = arrSanPham;
    }

    @Override
    public int getCount()
    {
        return arrSanPham.size();
    }

    @Override
    public Object getItem(int position)
    {
        return arrSanPham.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    public class ViewHolder
    {
        //public TextView txtTenSP;
        public  TextView txtThongTinSanPham;
        public TextView txtGiagoc;
        public TextView txtGiaKM;
        public TextView txtNhaCC;
        public TextView txtStatus;
        public ImageView imgHinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder=null;
        if(viewHolder==null)
        {
            viewHolder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.items_sanpham,null);
            viewHolder.txtGiagoc= (TextView) convertView.findViewById(R.id.txtGiaGoc);
            //viewHolder.txtTenSP= (TextView) convertView.findViewById(R.id.txtTenSanPham);
            viewHolder.txtThongTinSanPham= (TextView) convertView.findViewById(R.id.txtThongTinSP);
            viewHolder.txtGiaKM= (TextView) convertView.findViewById(R.id.txtGiaKhuyenMai);
            viewHolder.txtNhaCC= (TextView) convertView.findViewById(R.id.txtNhaCungCap);
            viewHolder.txtStatus= (TextView) convertView.findViewById(R.id.txtTrangThai);
            viewHolder.imgHinh= (ImageView) convertView.findViewById(R.id.imvHinhAnh);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        SanPham sanPham= (SanPham) getItem(position);
        viewHolder.txtGiagoc.setText(sanPham.getGiaNhap());
        DecimalFormat decimalFormat=new DecimalFormat("###,###,###");
        viewHolder.txtThongTinSanPham.setText("Thông tin sản phẩm: "+decimalFormat.format(sanPham.getChiTiet()));
        viewHolder.txtThongTinSanPham.setMaxLines(3);
        viewHolder.txtThongTinSanPham.setEllipsize(TextUtils.TruncateAt.END);
        viewHolder.txtGiaKM.setText(sanPham.getGiaKhuyenMai());
        viewHolder.txtNhaCC.setText(sanPham.getNhaPhanPhoi());
        viewHolder.txtStatus.setText(sanPham.getTrangThai());
        Picasso.with(context).load(sanPham.getHinhAnh()).into(viewHolder.imgHinh);
        return convertView;
    }
}
