/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLS.entity;

/**
 *
 * @author ACER
 */
public class KhachHang {
    private int MAKH;
    private String HOTEN;
    private String SDT;
    private String EMAIL;
    private String NGAYDK;

    public KhachHang() {
    }

    public KhachHang(int MAKH, String HOTEN, String SDT, String EMAIL, String NGAYDK) {
        this.MAKH = MAKH;
        this.HOTEN = HOTEN;
        this.SDT = SDT;
        this.EMAIL = EMAIL;
        this.NGAYDK = NGAYDK;
    }

    public int getMAKH() {
        return MAKH;
    }

    public void setMAKH(int MAKH) {
        this.MAKH = MAKH;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getNGAYDK() {
        return NGAYDK;
    }

    public void setNGAYDK(String NGAYDK) {
        this.NGAYDK = NGAYDK;
    }
    
            
}
