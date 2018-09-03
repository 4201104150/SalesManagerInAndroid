package com.example.escanor.projectsalesmanager;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        actionBarCustom();
    }

    private void actionBarCustom()
    {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Đăng Nhập");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setLogo(R.drawable.login);    //Icon muốn hiện thị
        actionBar.setDisplayUseLogoEnabled(true);
    }
}
