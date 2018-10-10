package com.example.escanor.intent_hcmue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    public static final int MY_REQUEST_CODE=777;
    Button btnThemSV;
    ListView lvDSSV;
    ArrayList mangSV=new ArrayList();
    ArrayAdapter adapterSV;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddControls();
        AddEvents();
    }

    private void AddEvents()
    {
        btnThemSV.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
    }

    private void AddControls()
    {
        btnThemSV=findViewById(R.id.btnThemSv);
        lvDSSV=findViewById(R.id.lvDSSV);
        adapterSV=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangSV);
        lvDSSV.setAdapter(adapterSV);
    }
}
