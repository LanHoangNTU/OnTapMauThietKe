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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien ql = new NhanVien(10000000, "Quan Ly", "A", null);
        NhanVien tp = new NhanVien(1000000, "Truong phong", "B", ql);
        NhanVien pp = new NhanVien(100000, "Pho phong", "C", tp);
        NhanVien nv = new NhanVien(0, "Nhan vien", "A", pp);

        System.out.println(nv.duyetVay(10000000));
    }
    
}
