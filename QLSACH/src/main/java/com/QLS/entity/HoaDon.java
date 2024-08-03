/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLS.entity;

import java.sql.Date;

/**
 *
 * @author ACER
 */
public class HoaDon {
    private int MAHD;
    private int MAKH;
    private float TONGTIEN;
    private Date NGAYLAPHOADON;

    public HoaDon() {
    }

    public HoaDon(int MAHD, int MAKH, float TONGTIEN, Date NGAYLAPHOADON) {
        this.MAHD = MAHD;
        this.MAKH = MAKH;
        this.TONGTIEN = TONGTIEN;
        this.NGAYLAPHOADON = NGAYLAPHOADON;
    }

    public int getMAHD() {
        return MAHD;
    }

    public void setMAHD(int MAHD) {
        this.MAHD = MAHD;
    }

    public int getMAKH() {
        return MAKH;
    }

    public void setMAKH(int MAKH) {
        this.MAKH = MAKH;
    }

    public float getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(float TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

    public Date getNGAYLAPHOADON() {
        return NGAYLAPHOADON;
    }

    public void setNGAYLAPHOADON(Date NGAYLAPHOADON) {
        this.NGAYLAPHOADON = NGAYLAPHOADON;
    }

    

    
    
}
