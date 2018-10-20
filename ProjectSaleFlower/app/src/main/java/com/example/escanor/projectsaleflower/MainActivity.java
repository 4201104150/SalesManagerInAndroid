package com.example.escanor.projectsaleflower;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.escanor.adapter.ListMenuAdapter;
import com.example.escanor.adapter.ListSanPhamAdapter;
import com.example.escanor.model.ListMenu;
import com.example.escanor.model.SanPham;
import com.example.escanor.util.CheckConnection;
import com.example.escanor.util.Server;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewFlipper viewFlipper;
    NavigationView navigationView;
    ListView lvDSSPNews,lvMnu;
    DrawerLayout drawerLayout;

    ArrayList<ListMenu> mangmnu;
    ListMenuAdapter listMenuAdapter;

    ArrayList<SanPham> mangSP;
    ListSanPhamAdapter listSanPhamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        if(CheckConnection.haveNetworkConnection(getApplicationContext()))
        {
            actionViewFlipper();
            addEvents();
            getDataMnu();
            getDataSP();
            actionBars();
        }
        else
        {
            CheckConnection.ShowToast_Short(getApplicationContext(),"Bạn hãy kiểm tra lại kết nối!");
            finish();
        }
    }

    private void getDataSP()
    {
        final RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Server.DuongDanSPMoi, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response)
            {
                if(response!=null)
                {
                    int id=0;
                    String chitiet="";
                    String hinh="";
                    int GiaBan=0;
                    int GiaKhuyenMai=0;
                    String NhaCC="";
                    String TrangThai="";
                    int IDNhanVien=0;
                    int sl=0;
                    int gianhap=0;

                    for(int i=0;i<response.length();i++)
                    {
                        try
                        {
                            JSONObject jsonObject = response.getJSONObject(i);
                            id=jsonObject.getInt("id");
                            chitiet=jsonObject.getString("detailComodity");
                            hinh=jsonObject.getString("imageCommodity");
                            GiaBan=jsonObject.getInt("salePrice");
                            GiaKhuyenMai=jsonObject.getInt("promostion");
                            NhaCC=jsonObject.getString("distributorCommodity");
                            TrangThai=jsonObject.getString("statusCommodity");
                            IDNhanVien=jsonObject.getInt("iDEmployees");
                            sl=jsonObject.getInt("amountCommodity");
                            gianhap=jsonObject.getInt("importPrice");

                            mangSP.add(new SanPham(id,IDNhanVien,chitiet,hinh,NhaCC,TrangThai,sl,gianhap,GiaBan,GiaKhuyenMai));
                            listSanPhamAdapter.notifyDataSetChanged();
                        }
                        catch (JSONException e)
                        {

                        }
                    }
                }
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {

            }
        });
        requestQueue.add(jsonArrayRequest);
    }

    private void actionBars()
    {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void getDataMnu() {
        final RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Server.DuongDan, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response)
            {
                if(response!=null)
                {
                    int id=0;
                    String tenloai="";
                    String hinh="";
                    for(int i=0;i<response.length();i++)
                    {
                        try
                        {
                            JSONObject jsonObject = response.getJSONObject(i);
                            id=jsonObject.getInt("ID");
                            tenloai=jsonObject.getString("TenLoai");
                            hinh=jsonObject.getString("HinhAnh");
                            mangmnu.add(new ListMenu(id,tenloai,hinh));
                            listMenuAdapter.notifyDataSetChanged();
                        }
                        catch (JSONException e)
                        {

                        }
                    }
                }
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {

            }
        });
        requestQueue.add(jsonArrayRequest);
    }

    private void actionViewFlipper() {
        ArrayList<String> mangQuangCao=new ArrayList<>();
        mangQuangCao.add("https://images.pexels.com/photos/658687/pexels-photo-658687.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
        mangQuangCao.add("https://images.pexels.com/photos/863963/pexels-photo-863963.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
        mangQuangCao.add("https://images.pexels.com/photos/639086/pexels-photo-639086.jpeg?auto=compress&cs=tinysrgb&h=650&w=940");
        mangQuangCao.add("https://images.pexels.com/photos/823816/pexels-photo-823816.jpeg?auto=compress&cs=tinysrgb&h=650&w=940");
        mangQuangCao.add("https://images.pexels.com/photos/210628/pexels-photo-210628.jpeg?auto=compress&cs=tinysrgb&h=650&w=940");
        mangQuangCao.add("https://images.pexels.com/photos/531731/pexels-photo-531731.jpeg?auto=compress&cs=tinysrgb&h=650&w=940");
        for(int i=0;i<mangQuangCao.size();i++)
        {
            ImageView imageView=new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(mangQuangCao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        Animation animation_Slide_In= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation animation_Slide_Out=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_Slide_In);
        viewFlipper.setOutAnimation(animation_Slide_Out);
    }
    private void addEvents()
    {

    }

    private void addControls()
    {
        viewFlipper= (ViewFlipper) findViewById(R.id.viewlipper);
        lvDSSPNews= (ListView) findViewById(R.id.lvDanhSachSanPhamMoi);
        drawerLayout= (DrawerLayout) findViewById(R.id.drawerlayout);
        lvMnu= (ListView) findViewById(R.id.lvMnu);
        toolbar= (Toolbar) findViewById(R.id.toolBarBar);
        navigationView= (NavigationView) findViewById(R.id.navigationView);

        mangmnu=new ArrayList<>();
        listMenuAdapter=new ListMenuAdapter(mangmnu,getApplicationContext());
        lvMnu.setAdapter(listMenuAdapter);

        mangSP=new ArrayList<>();
        listSanPhamAdapter=new ListSanPhamAdapter(getApplicationContext(),mangSP);
        lvDSSPNews.setAdapter(listSanPhamAdapter);
    }
}
