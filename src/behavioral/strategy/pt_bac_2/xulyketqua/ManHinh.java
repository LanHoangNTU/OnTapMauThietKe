/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.pt_bac_2.xulyketqua;

import behavioral.strategy.pt_bac_2.PhuongTrinhBac2;

/**
 *
 * @author Lân
 */
public class ManHinh implements IXuLyKetQua{

    @Override
    public void xuLy(PhuongTrinhBac2 ptb) {
        StringBuilder b = new StringBuilder();
        b.append(ptb.inPhuongTrinh())
                .append(ptb.getKetQua());
        System.out.println(b.toString());
    }
    
}
