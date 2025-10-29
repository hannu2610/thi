package com.example.DangTieuHan_29.thi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamSTest {
    private SanPhamS service;
@BeforeEach
    public void setUp(){
    service=new SanPhamS();
}

@Test
    public void themhople(){
    SanPham sanPham= new SanPham("1","Haa",12,10.0f,20,"ok");
    assertTrue(service.add(sanPham));
}
@Test
    public void themhoplecanbienla1(){
    SanPham sanPham= new SanPham("1","Haa",12,10.0f,1,"ok");
    assertTrue(service.add(sanPham));
}
    @Test
    public void themhoplecanbienla100(){
        SanPham sanPham= new SanPham("1","Haa",12,10.0f,100,"ok");
        assertTrue(service.add(sanPham));
    }
    @Test
    public void themhopkhoplebienla101(){
        SanPham sanPham= new SanPham("1","Haa",12,10.0f,101,"ok");
        assertThrows(IllegalArgumentException.class,()->service.add(sanPham));
    }
    @Test
    public void themkhoplekhinull(){
        SanPham sanPham= new SanPham("","",0,0f,0,"");
        assertThrows(IllegalArgumentException.class,()->service.add(sanPham));
    }
    @Test
    public void themkhoplekhisoluong0(){
        SanPham sanPham= new SanPham("1","Haa",12,10.0f,0,"ok");
        assertThrows(IllegalArgumentException.class,()->service.add(sanPham));
    }
    @Test
    public void themtrung(){
        SanPham sanPham= new SanPham("1","Haa",12,10.0f,20,"ok");
        SanPham sanPham1= new SanPham("1","Haa",12,10.0f,20,"ok");
        assertTrue(service.add(sanPham));
        assertThrows(IllegalArgumentException.class,()->service.add(sanPham1));

    }
}