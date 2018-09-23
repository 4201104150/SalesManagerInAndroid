package com.example.escanor.model;

import java.security.PublicKey;
import java.util.Date;

public class ThongTinSanPham
{
    public int ID;
    public String IDComodity;
    public String ChiTiet;
    public String HinhAnh;
    public String NhaPhanPhoi;
    public String TrangThai;
    public int SoLuonh;
    public int GiaNhap;
    public int GiaBan;
    public int GiaKhuyenMai;

    public ThongTinSanPham() {
    }

    public ThongTinSanPham(int ID, String IDComodity, String chiTiet, String hinhAnh, String nhaPhanPhoi, String trangThai, int soLuonh, int giaNhap, int giaBan, int giaKhuyenMai)
    {
        this.ID = ID;
        this.IDComodity = IDComodity;
        ChiTiet = chiTiet;
        HinhAnh = hinhAnh;
        NhaPhanPhoi = nhaPhanPhoi;
        TrangThai = trangThai;
        SoLuonh = soLuonh;
        GiaNhap = giaNhap;
        GiaBan = giaBan;
        GiaKhuyenMai = giaKhuyenMai;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIDComodity() {
        return IDComodity;
    }

    public void setIDComodity(String IDComodity) {
        this.IDComodity = IDComodity;
    }

    public String getChiTiet() {
        return ChiTiet;
    }

    public void setChiTiet(String chiTiet) {
        ChiTiet = chiTiet;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getNhaPhanPhoi() {
        return NhaPhanPhoi;
    }

    public void setNhaPhanPhoi(String nhaPhanPhoi) {
        NhaPhanPhoi = nhaPhanPhoi;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    public int getSoLuonh() {
        return SoLuonh;
    }

    public void setSoLuonh(int soLuonh) {
        SoLuonh = soLuonh;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        GiaNhap = giaNhap;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int giaBan) {
        GiaBan = giaBan;
    }

    public int getGiaKhuyenMai() {
        return GiaKhuyenMai;
    }

    public void setGiaKhuyenMai(int giaKhuyenMai) {
        GiaKhuyenMai = giaKhuyenMai;
    }
}
