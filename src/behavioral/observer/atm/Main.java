/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.atm;

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
        TaiKhoan tk = new TaiKhoan(100);
        ATM atm = new ATM();
        tk.login(atm);
        atm.rutTien(10);
        System.out.println(tk.getSoDu());
        atm.rutTien(100);
        System.out.println(tk.getSoDu());
        tk.logout(atm);
        
        TaiKhoan tk2 = new TaiKhoan(1000);
        tk2.login(atm);
        atm.rutTien(100);
        System.out.println(tk2.getSoDu());
        atm.rutTien(100);
        System.out.println(tk2.getSoDu());
    }
    
}
