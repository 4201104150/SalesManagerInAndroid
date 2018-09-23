package com.example.escanor.projectsalesmanager;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBarHide();
        chuyenDoiManHinh();

    }

    private void chuyenDoiManHinh()
    {
        Thread bamgio=new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(7000);
                } catch (Exception e)
                {

                }
                finally
                {
                    Intent activitymoi=new Intent(MainActivity.this,SanPhamActivity.class);
                    startActivity(activitymoi);
                }
            }
        };
        bamgio.start();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }

    private void actionBarHide()
    {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
