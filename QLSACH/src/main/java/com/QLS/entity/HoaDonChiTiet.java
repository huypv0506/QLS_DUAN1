/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLS.entity;

/**
 *
 * @author ACER
 */
public class HoaDonChiTiet {
    private int MAHD;
    private String MASACH;
    private int SOLUONG;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int MAHD, String MASACH, int SOLUONG) {
        this.MAHD = MAHD;
        this.MASACH = MASACH;
        this.SOLUONG = SOLUONG;
    }

    public int getMAHD() {
        return MAHD;
    }

    public void setMAHD(int MAHD) {
        this.MAHD = MAHD;
    }

    public String getMASACH() {
        return MASACH;
    }

    public void setMASACH(String MASACH) {
        this.MASACH = MASACH;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }
    
}
