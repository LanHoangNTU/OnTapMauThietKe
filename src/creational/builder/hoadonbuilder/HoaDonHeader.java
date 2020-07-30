/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.hoadonbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lân
 */
public class HoaDonHeader {
    private String maHoaDon;
    private Date ngayBan;
    private String tenKhachHang;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.maHoaDon = maHoaDon;
        this.ngayBan = formatter.parse(ngayBan);
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Ma hoa don: ").append(maHoaDon)
                .append("\nNgay Ban: ").append(ngayBan.toString())
                .append("\nTen khach hang: ").append(tenKhachHang);
        return b.toString();
    }
}
