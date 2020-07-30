/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.hoadonbuilder;

/**
 *
 * @author Lân
 */
public class CTHD {
    private String sanPham;
    private int soLuong;
    private double donGia;
    private double chietKhau;

    public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(double chietKhau) {
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Ten san pham: ").append(sanPham)
                .append("\nSo luong: ").append(soLuong)
                .append("\nDon gia: ").append(donGia)
                .append("\nChiet khau: ").append(chietKhau);
        return b.toString();
    }
}
