package com.example.escanor.projectsalesmanager;

import android.app.ActionBar;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class SanPhamActivity extends AppCompatActivity
{
    android.support.v7.widget.Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerViewMangHinhChinh;
    NavigationView navigationView;
    ListView lvMangHinhChinh;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham);

        addControls();
        //actionBar();
        actionViewFlipper();
        addEvents();
    }

    private void actionViewFlipper() {
        ArrayList<String> mangQuangCao=new ArrayList<>();
        mangQuangCao.add("https://images.pexels.com/photos/658687/pexels-photo-658687.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
        mangQuangCao.add("https://images.pexels.com/photos/863963/pexels-photo-863963.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
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
        toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbarMangHinhChinh);
        viewFlipper= (ViewFlipper) findViewById(R.id.viewlipper);
        recyclerViewMangHinhChinh= (RecyclerView) findViewById(R.id.recyclerview);
        navigationView= (NavigationView) findViewById(R.id.navigationview);
        lvMangHinhChinh= (ListView) findViewById(R.id.lvMangHinhChinh);
        drawerLayout= (DrawerLayout) findViewById(R.id.drawerlayout);
    }

}
