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
public class Delta implements ITinhNghiem{

    public Delta() {
    }

    @Override
    public float tinhToan(PhuongTrinhBac2 ptb) {
        int a = ptb.getA();
        int b = ptb.getB();
        int c = ptb.getC();
        
        return (float)(b*b - 4*a*c);
    }
}
