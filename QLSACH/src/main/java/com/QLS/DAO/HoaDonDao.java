/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLS.DAO;

import java.util.List;
import com.QLS.entity.HoaDon;
import com.QLS.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class HoaDonDao extends QLSDao<HoaDon, String> {

    @Override
    public void insert(HoaDon entity) {
        String sql="INSERT INTO KhoaHoc (MAHD, MAKH, TONGTIEN, NGAYLAPHOADON) VALUES (?, ?, ?, ?,)";
        XJdbc.update(sql, 
                entity.getMAHD(),
                entity.getMAKH(),
                entity.getTONGTIEN(),
                entity.getNGAYLAPHOADON()
        );
    }

    @Override
    public void update(HoaDon entity) {
        String sql="UPDATE HOADON SET MAKH=?, TONGTIEN=?, NGAYLAPHOADON=? WHERE MAHD=?";
        XJdbc.update(sql,
                entity.getMAHD(),
                entity.getMAKH(),
                entity.getTONGTIEN(),
                entity.getNGAYLAPHOADON()
                
        );
    }

    @Override
    public void delete(String id) {
        String sql="DELETE FROM HOADON WHERE MADH=?";
        XJdbc.update(sql, id);
    }

    @Override
    public HoaDon selectById(String id) {
        String sql="SELECT * FROM NHANVIEN WHERE MANV=?";
        List<HoaDon> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM HOADON";
        return this.selectBySql(sql);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    HoaDon hd = new HoaDon();
                    hd.setMAHD(rs.getInt("MAHD"));
                    hd.setMAKH(rs.getInt("MAKH"));
                    hd.setTONGTIEN(rs.getFloat("TONGTIEN"));
                    hd.setNGAYLAPHOADON(rs.getDate("NGAYLAPHOADON"));
                    list.add(hd);

                }
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    public List<HoaDon> selectByChuyenDe(String mahd){
        String sql="SELECT * FROM HOADON WHERE MAHD=?";
        return this.selectBySql(sql, mahd);
    }
    public List<Integer> selectYears() {
        String sql="SELECT DISTINCT year(NGAYLAPHOADON) Year FROM HOADON ORDER BY Year DESC";
        List<Integer> list=new ArrayList<>();
        try {
           ResultSet rs = XJdbc.query(sql);
           while(rs.next()){
                 list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
