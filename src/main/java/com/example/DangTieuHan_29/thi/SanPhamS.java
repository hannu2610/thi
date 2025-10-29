package com.example.DangTieuHan_29.thi;

import java.util.ArrayList;
import java.util.List;

public class SanPhamS {
    private List<SanPham> ds= new ArrayList<>();

    public boolean add(SanPham sanPham){
        if (sanPham.getMa()==null||sanPham.getMa().trim().isEmpty()
        ||sanPham.getTen()==null|| sanPham.getTen().trim().isEmpty()
        ||sanPham.getNbh()== 0
        ||sanPham.getGia()==0
        ||sanPham.getSl()==0
        ||sanPham.getDanhmuc()==null||sanPham.getDanhmuc().trim().isEmpty()){
            throw new IllegalArgumentException("khong duoc de trong");
        }
            if (sanPham.getSl()<1||sanPham.getSl()>100){
                throw new IllegalArgumentException("qua pham vi");
        }
            for (SanPham sanPham1:ds){
                if (sanPham1.getMa().equals(sanPham.getMa())){
                    throw new IllegalArgumentException("trung");
                }
            }
            ds.add(sanPham);
            return true;
    }
}
