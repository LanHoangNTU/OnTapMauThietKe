/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chainofresponsibility.duyetvay;

/**
 *
 * @author Lân
 */
public class NhanVien {
    private final int hanMucDuyet;
    private final String chucVu;
    private final String ten;
    private final NhanVien capTren;

    public NhanVien(int hanMucDuyet, String chucVu, String ten, NhanVien capTren) {
        this.hanMucDuyet = hanMucDuyet;
        this.chucVu = chucVu;
        this.ten = ten;
        this.capTren = capTren;
    }
    
    public String duyetVay(int tienVay){
        StringBuilder b = new StringBuilder();
        b.append(chucVu).append(" ").append(ten);
        if(tienVay <= hanMucDuyet){
            b.append(" duyệt vay số tiền ").append(tienVay);
        }
        else if (capTren != null){
            return capTren.duyetVay(tienVay);
        }
        else{
            b.append(" thông báo không cho vay");
        }
        
        return b.toString();
    }
}
