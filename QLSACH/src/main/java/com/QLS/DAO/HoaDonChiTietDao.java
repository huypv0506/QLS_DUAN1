/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLS.DAO;

import java.util.List;
import com.QLS.entity.HoaDonChiTiet;
import com.QLS.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class HoaDonChiTietDao extends QLSDao<HoaDonChiTiet, String> {

    @Override
    public void insert(HoaDonChiTiet entity) {
        String sql = "INSERT INTO HOADONCHITIET (MAHD, MASACH, SOLUONG, TONGTIEN) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql,
                entity.getMAHD(),
                entity.getMASACH(),
                entity.getSOLUONG(),
                entity.getTONGTIEN()
        );
    }

    @Override
    public void update(HoaDonChiTiet entity) {
        String sql = "UPDATE HOADONCHITIET SET MASACH=?, SOLUONG=?, TONGTIEN=? WHERE MAHD=?";
        XJdbc.update(sql,
                entity.getMAHD(),
                entity.getMASACH(),
                entity.getSOLUONG(),
                entity.getTONGTIEN()
        );
                }

    @Override
    public void delete(String id) {
        String sql="DELETE FROM HOADONCHITIET WHERE MAHD=?";
        XJdbc.update(sql, id);
    }

    @Override
    public HoaDonChiTiet selectById(String id) {
        String sql = "SELECT * FROM HOADON WHERE MAHD=?";
        List<HoaDonChiTiet> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HoaDonChiTiet> selectAll() {
        String sql = "SELECT * FROM HOADONCHITIET";
        return this.selectBySql(sql);
    }

    @Override
    protected List<HoaDonChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    HoaDonChiTiet hdct = new HoaDonChiTiet();
                    hdct.setMAHD(rs.getInt("MAHD"));
                    hdct.setMASACH(rs.getString("MASACH"));
                    hdct.setSOLUONG(rs.getInt("SOLUONG"));
                    hdct.setTONGTIEN(rs.getFloat("TONGTIEN"));
                    list.add(hdct);

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

}
