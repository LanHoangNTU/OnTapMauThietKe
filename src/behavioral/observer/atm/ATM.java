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
public class ATM {
    ITaiKhoanListener tk;

    public ATM() {
    }
    
    public void login(ITaiKhoanListener listener){
        if (tk == null) {
            tk = listener;
        }
    }
    
    public void logout(ITaiKhoanListener listener){
        if (tk != null) {
            tk = null;
        }
    }
    
    public boolean kiemTraTienRut(float withdrawal){
        return tk.kiemTraSoDu(withdrawal);
    }
    
    public void rutTien(float withdrawal){
        if (kiemTraTienRut(withdrawal)) {
            tk.nhanThongBao(true, withdrawal);
        }
        else{
            tk.nhanThongBao(false, 0);
        }
    }
}