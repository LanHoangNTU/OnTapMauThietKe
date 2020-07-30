/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.pt_bac_2;

import behavioral.strategy.pt_bac_2.xulyketqua.ManHinh;
import behavioral.strategy.pt_bac_2.nhapthamso.DocFile;

/**
 *
 * @author Lân
 */
public class Main {
    public static void main(String[] args) {
        PhuongTrinhBac2 pt1 = new PhuongTrinhBac2();
        pt1.setNhapThamSo(new DocFile("thamso.txt"));
        pt1.nhapThamSo();
        pt1.giaiPhuongTrinh();
        pt1.setXuLyKetQua(new ManHinh());
        //pt1.setXuLyKetQua(new GhiFile("ketqua.txt"));
        pt1.xuLyKetQua();
    }
}
