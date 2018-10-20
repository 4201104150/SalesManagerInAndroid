package com.example.escanor.model;

import java.security.PublicKey;
import java.util.Date;

public class SanPham
{
    public int ID;
    public int IDNhanVien;
    public String ChiTiet;
    public String HinhAnh;
    public String NhaPhanPhoi;
    public String TrangThai;
    public int SoLuong;
    public int GiaNhap;
    public int GiaBan;
    public int GiaKhuyenMai;

    public SanPham()
    {
    }
    public SanPham(int ID, int IDNhanVien, String chiTiet, String hinhAnh, String nhaPhanPhoi, String trangThai, int soLuong, int giaNhap, int giaBan, int giaKhuyenMai)
    {
        this.ID = ID;
        this.IDNhanVien = IDNhanVien;
        this.ChiTiet = chiTiet;
        this.HinhAnh = hinhAnh;
        this.NhaPhanPhoi = nhaPhanPhoi;
        this.TrangThai = trangThai;
        this.SoLuong = soLuong;
        this.GiaNhap = giaNhap;
        this.GiaBan = giaBan;
        this.GiaKhuyenMai = giaKhuyenMai;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public int getIDNhanVien()
    {
        return IDNhanVien;
    }

    public void setIDNhanVien(int IDNhanVien)
    {
        this.IDNhanVien = IDNhanVien;
    }

    public String getChiTiet()
    {
        return ChiTiet;
    }

    public void setChiTiet(String chiTiet)
    {
        ChiTiet = chiTiet;
    }

    public String getHinhAnh()
    {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh)
    {
        HinhAnh = hinhAnh;
    }

    public String getNhaPhanPhoi()
    {
        return NhaPhanPhoi;
    }

    public void setNhaPhanPhoi(String nhaPhanPhoi)
    {
        NhaPhanPhoi = nhaPhanPhoi;
    }

    public String getTrangThai()
    {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong)
    {
        SoLuong = soLuong;
    }

    public int getGiaNhap()
    {
        return GiaNhap;
    }

    public void setGiaNhap(int giaNhap)
    {
        GiaNhap = giaNhap;
    }

    public int getGiaBan()
    {
        return GiaBan;
    }

    public void setGiaBan(int giaBan)
    {
        GiaBan = giaBan;
    }

    public int getGiaKhuyenMai()
    {
        return GiaKhuyenMai;
    }

    public void setGiaKhuyenMai(int giaKhuyenMai)
    {
        GiaKhuyenMai = giaKhuyenMai;
    }
}
