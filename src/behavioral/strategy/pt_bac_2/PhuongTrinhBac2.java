/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.pt_bac_2;

import behavioral.strategy.pt_bac_2.xulyketqua.IXuLyKetQua;
import behavioral.strategy.pt_bac_2.nhapthamso.INhapThamSo;

/**
 *
 * @author Lân
 */
public class PhuongTrinhBac2 {
    private int a, b, c;
    private String ketQua;
    private ITinhNghiem nghiem;
    private IXuLyKetQua xuLyKetQua;
    private INhapThamSo nhapThamSo;

    public PhuongTrinhBac2() {
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setNhapThamSo(INhapThamSo nhapThamSo) {
        this.nhapThamSo = nhapThamSo;
    }
    
    public void setNghiem(ITinhNghiem nghiem) {
        this.nghiem = nghiem;
    }

    public void setXuLyKetQua(IXuLyKetQua xuLyKetQua) {
        this.xuLyKetQua = xuLyKetQua;
    }
    
    public void nhapThamSo(){
        int arr[] = nhapThamSo.nhapThamSo();
        a = arr[0];
        b = arr[1];
        c = arr[2];
    }
    
    public float tinhToan(){
        return nghiem.tinhToan(this);
    }
    
    public void xuLyKetQua(){
        xuLyKetQua.xuLy(this);
    }
    public void giaiPhuongTrinh(){
        StringBuilder bd = new StringBuilder();
        bd.append("\nKết quả: ");
        
        setNghiem(new Delta());
        float delta = tinhToan();
        if (delta < 0) {
            bd.append("Vô nghiệm.");
        }
        else if (delta == 0) {
            setNghiem(new NghiemThuNhat());
            float kq = tinhToan();
            bd.append("Nghiệm kép x = ")
                    .append(kq);
        }
        else{
            setNghiem(new NghiemThuNhat());
            float kq = tinhToan();
            setNghiem(new NghiemThuHai());
            float kq2 = tinhToan();
            bd.append("Nghiệm đôi x1 = ")
                    .append(kq)
                    .append(" và x2 = ")
                    .append(kq2);
        }
        ketQua = bd.toString();
    }
    
    public String inPhuongTrinh(){
        StringBuilder bd = new StringBuilder();
        bd.append("Phương trình ").append(a)
                .append("x2 ");
        if(b > 0) bd.append("+");
        
        bd.append(b).append("x ");
        if(c > 0) bd.append("+");
        bd.append(c);
        return bd.toString();
    }
}
