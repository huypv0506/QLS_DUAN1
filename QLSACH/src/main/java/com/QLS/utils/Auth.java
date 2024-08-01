/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLS.utils;
import com.QLS.entity.NhanVien;
/**
 *
 * @author ACER
 */
public class Auth {
    public static NhanVien user = null;
    
//    /**
//     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
//     */
    public static void clear() {
        Auth.user = null;
    }
//    /**
//     * Kiểm tra xem đăng nhập hay chưa
//     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
}
