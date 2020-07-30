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
public class TaiKhoan implements ITaiKhoanListener{
    private float soDu;

    public float getSoDu() {
        return soDu;
    }

    public void setSoDu(float soDu) {
        this.soDu = soDu;
    }

    public TaiKhoan(float soDu) {
        this.soDu = soDu;
    }
    
    public void login(ATM atm){
        atm.login(this);
    }
    
    public void logout(ATM atm){
        atm.logout(this);
    }

    @Override
    public boolean kiemTraSoDu(float withdrawal) {
        return soDu >= withdrawal;
    }

    @Override
    public void nhanThongBao(boolean qualified, float withdrawal) {
        String message;
        if (qualified) {
            soDu -= withdrawal;
            message = "ĐÃ RÚT!";
        }
        else{
            message = "SỐ DƯ KHÔNG ĐỦ!";
        }
        System.out.println(message);
    }
}
