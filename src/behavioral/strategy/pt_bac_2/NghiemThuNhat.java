/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.pt_bac_2;

/**
 *
 * @author Lân
 */
public class NghiemThuNhat implements ITinhNghiem{

    @Override
    public float tinhToan(PhuongTrinhBac2 ptb) {
        int a = ptb.getA();
        int b = ptb.getB();
        int c = ptb.getC();
        float delta = (float)(b*b - 4*a*c);
        return (float) (((-b) + Math.sqrt(delta))/(c+c));
    }
    
}
