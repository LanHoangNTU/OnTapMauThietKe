/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.shopping;

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
        Cart c = new Cart();
        CartInfo i1 = new CartInfo("mh1", 10, 100);
        CartInfo i2 = new CartInfo("mh2", 10, 10);
        CartInfo i3 = new CartInfo("mh3", 10, 20);
        CartInfo i4 = new CartInfo("mh4", 10, 30);
        c.themVaoGioHang(i1);
        c.themVaoGioHang(i2);
        c.themVaoGioHang(i3);
        c.themVaoGioHang(i4);
        c.tinhTienGioHang();
        
        c.undo();
        c.xemGioHang();
        c.tinhTienGioHang();
        
        c.redo();
        c.xemGioHang();
        c.tinhTienGioHang();
    }
    
}
