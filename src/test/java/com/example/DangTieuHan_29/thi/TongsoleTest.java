package com.example.DangTieuHan_29.thi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongsoleTest {
    private Tongsole service;
@BeforeEach
    public void setUp(){
    service= new Tongsole();
}

@Test
    public void tongsolehople(){
    int a=9;
    int b=77;
    assertEquals(1428,service.tong(a,b));
}

@Test
    public void tongsolecanbienduoila1(){
    int a=1;
    int b=7;
    assertEquals(9,service.tong(a,b));

}
@Test
    public void tongsolebienduoila0(){
    int a=0;
    int b=7;
   assertThrows(IllegalArgumentException.class,()->service.tong(a,b));
}
@Test
    public void tongsolecanbientrenla999(){
    int a=991;
    int b=999;
    assertEquals(3976,service.tong(a,b));

}
@Test
    public void tongsoleam(){
   int a=-1;
   int b=9;
    assertThrows(IllegalArgumentException.class,()->service.tong(a,b));

}
}