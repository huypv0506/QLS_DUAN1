/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLS.entity;

/**
 *
 * @author ACER
 */
public class NhanVien {
    private String MANV;
    private String HOTEN;
    private String MATKHAU;
    private int VAITRO;
    private String EMAIL;

    public NhanVien() {
    }

    public NhanVien(String MANV, String HOTEN, String MATKHAU, int VAITRO, String EMAIL) {
        this.MANV = MANV;
        this.HOTEN = HOTEN;
        this.MATKHAU = MATKHAU;
        this.VAITRO = VAITRO;
        this.EMAIL = EMAIL;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    public int getVAITRO() {
        return VAITRO;
    }

    public void setVAITRO(int VAITRO) {
        this.VAITRO = VAITRO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
}
