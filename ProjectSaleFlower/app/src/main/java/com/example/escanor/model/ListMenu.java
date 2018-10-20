package com.example.escanor.model;

public class ListMenu
{
    public int id;
    public String tenloai;
    public String hinhanh;

    public ListMenu(int id, String tenloai, String hinhanh)
    {
        this.id = id;
        this.tenloai = tenloai;
        this.hinhanh = hinhanh;
    }

    public ListMenu()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTenloai()
    {
        return tenloai;
    }

    public void setTenloai(String tenloai)
    {
        this.tenloai = tenloai;
    }

    public String getHinhanh()
    {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh)
    {
        this.hinhanh = hinhanh;
    }
}
