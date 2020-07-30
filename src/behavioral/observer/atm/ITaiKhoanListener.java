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
public interface ITaiKhoanListener {
    public boolean kiemTraSoDu(float withdrawal);
    public void nhanThongBao(boolean qualified, float withdrawal);
}
