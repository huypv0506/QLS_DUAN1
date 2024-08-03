/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLS.DAO;

import com.QLS.entity.NhanVien;
import java.util.List;
import com.QLS.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class NhanVienDao extends QLSDao<NhanVien, String>{

    @Override
    public void insert(NhanVien entity) {
        String sql="INSERT INTO NHANVIEN (MANV, HOTEN, MATKHAU, VAITRO, EMAIL) VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql,
            entity. getMANV(),
            entity.getHOTEN(),
            entity.getMATKHAU(),
            entity.getVAITRO(),
            entity.getEMAIL()
        );
                
    }

    @Override
    public void update(NhanVien entity) {
        String sql="UPDATE NHANVIEN SET HOTEN=?, MATKHAU=?, VAITRO=?, EMAIL=? WHERE MANV=?";
        XJdbc.update(sql,
                
                entity.getHOTEN(),
                entity.getMATKHAU(),
                entity.getVAITRO(),
                entity.getEMAIL(),
                entity.getMANV()
                
        );
    }
    public void updatpassword( NhanVien entity){
        String sql="UPDATE NHANVIEN SET MATKHAU=? WHERE MANV=?";
        XJdbc.update(sql,
                entity.getMATKHAU(),
                entity.getMANV()
        );
    }
    public void forgotpassword(NhanVien entity) {
            String sql="UPDATE NHANVIEN SET MATKHAU=? WHERE EMAIL=?";
        XJdbc.update(sql,
                entity.getMATKHAU(),
                entity.getEMAIL()
        );
    }
         public NhanVien selectByemail(String email) {
        String sql="SELECT * FROM NHANVIEN WHERE EMAIL=?";
        List<NhanVien> list = this.selectBySql(sql, email);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public void delete(String MANV) {
        String sql = "DELETE * FROM NHANVIEN WHERE MANV=?";
        XJdbc.update(sql, MANV);
    }

    @Override
    public NhanVien selectById(String id) {
        String sql="SELECT * FROM NHANVIEN WHERE MANV=?";
        List<NhanVien> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NhanVien> selectAll() {
         String sql="SELECT * FROM NHANVIEN";
         return this.selectBySql(sql);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                   NhanVien nv = new NhanVien();
                   nv.setMANV(rs.getString("MANV"));
                   nv.setHOTEN(rs.getString("HOTEN"));
                   nv.setMATKHAU(rs.getString("MATKHAU"));
                   nv.setVAITRO(rs.getInt("VAITRO"));
                   nv.setEMAIL(rs.getString("EMAIL"));
                   list.add(nv);
                   
                   
                }
            } 
            finally{
                if(rs != null)
                    rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    
}
