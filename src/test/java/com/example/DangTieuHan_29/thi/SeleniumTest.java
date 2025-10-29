package com.example.DangTieuHan_29.thi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.*;

class SeleniumTest {
WebDriver webDriver;
@BeforeClass
public void setUp(){
    webDriver=new ChromeDriver();
    webDriver.manage().window().maximize();
}
}