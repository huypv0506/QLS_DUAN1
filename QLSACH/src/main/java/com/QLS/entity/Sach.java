/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLS.entity;

/**
 *
 * @author ACER
 */
public class Sach {
    private String MASACH;
    private String TENSACH;
    private int LOAISACH;
    private String TACGIA;
    private int SOLUONG;
    private float GIA;
    private int NGAYXUATBAN;
    private String MOTA;
    private String MANV;

    public Sach() {
    }

    public Sach(String MASACH, String TENSACH, int LOAISACH, String TACGIA, int SOLUONG, float GIA, int NGAYXUATBAN, String MOTA, String MANV) {
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.LOAISACH = LOAISACH;
        this.TACGIA = TACGIA;
        this.SOLUONG = SOLUONG;
        this.GIA = GIA;
        this.NGAYXUATBAN = NGAYXUATBAN;
        this.MOTA = MOTA;
        this.MANV = MANV;
    }

    public String getMASACH() {
        return MASACH;
    }

    public void setMASACH(String MASACH) {
        this.MASACH = MASACH;
    }

    public String getTENSACH() {
        return TENSACH;
    }

    public void setTENSACH(String TENSACH) {
        this.TENSACH = TENSACH;
    }

    public int getLOAISACH() {
        return LOAISACH;
    }

    public void setLOAISACH(int LOAISACH) {
        this.LOAISACH = LOAISACH;
    }

    public String getTACGIA() {
        return TACGIA;
    }

    public void setTACGIA(String TACGIA) {
        this.TACGIA = TACGIA;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public float getGIA() {
        return GIA;
    }

    public void setGIA(float GIA) {
        this.GIA = GIA;
    }

    public int getNGAYXUATBAN() {
        return NGAYXUATBAN;
    }

    public void setNGAYXUATBAN(int NGAYXUATBAN) {
        this.NGAYXUATBAN = NGAYXUATBAN;
    }

    public String getMOTA() {
        return MOTA;
    }

    public void setMOTA(String MOTA) {
        this.MOTA = MOTA;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }
    
    
}
