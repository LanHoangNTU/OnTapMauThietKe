/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.khoabomon;

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
        AKhoa khoa = new BoMon("CNTT");
        AKhoa httt = new BoMon("He Thong Thong Tin");
        AKhoa cnpm = new BoMon("Cong Nghe Phan Mem");
        AKhoa gv1 = new GiangVien("Giao vien 1");
        AKhoa gv2 = new GiangVien("Giao vien 2");
        AKhoa gv3 = new GiangVien("Giao vien 3");
        AKhoa gv4 = new GiangVien("Giao vien 4");
        
        httt.add(gv1);
        httt.add(gv2);
        
        cnpm.add(gv3);
        cnpm.add(gv4);
        
        khoa.add(httt);
        khoa.add(cnpm);
        
        System.out.println(khoa.getHierarchy("-"));
    }
    
}
