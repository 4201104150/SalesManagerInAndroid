package com.example.escanor.projectsalesmanager;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity
{
    EditText txtUserName,txtPassword;
    Button btnDangNhap,btnDangky;
    ImageView btnFace,btnZalo;
    CheckBox chbNhoDangNhap;

    LinearLayout l1,l2;

    Animation uptodown,downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        actionBarCustom();

        addControls();
        addEvents();
    }

    private void addEvents()
    {
        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"Chức năng chưa được xây dựng!!!",Toast.LENGTH_LONG);
            }
        });

        btnZalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"Chức năng chưa được xây dựng!!!",Toast.LENGTH_LONG);
            }
        });
    }

    private void addControls()
    {
        txtUserName=findViewById(R.id.txtUserName);
        txtPassword=findViewById(R.id.txtPassword);

        btnDangky=findViewById(R.id.btnDangKy);
        btnDangNhap=findViewById(R.id.btnDangNhap);

        btnFace=findViewById(R.id.btnFacebook);
        btnZalo=findViewById(R.id.btnZalo);

        l1=(LinearLayout)findViewById(R.id.l1);
        l2=(LinearLayout)findViewById(R.id.l2);

        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        l1.setAnimation(uptodown);
        downtoup=AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l2.setAnimation(downtoup);
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
