package com.example.DangTieuHan_29.thi;

public class SanPham {
    private String ma;
    private String ten;
    private Integer nbh;
    private Float gia;
    private Integer sl;
    private String danhmuc;

    public SanPham(String ma, String ten, Integer nbh, Float gia, Integer sl, String danhmuc) {
        this.ma = ma;
        this.ten = ten;
        this.nbh = nbh;
        this.gia = gia;
        this.sl = sl;
        this.danhmuc = danhmuc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getNbh() {
        return nbh;
    }

    public void setNbh(Integer nbh) {
        this.nbh = nbh;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }
}
