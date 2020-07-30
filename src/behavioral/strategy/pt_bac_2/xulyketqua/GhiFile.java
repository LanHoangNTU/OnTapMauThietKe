/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.pt_bac_2.xulyketqua;

import behavioral.strategy.pt_bac_2.PhuongTrinhBac2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Lân
 */
public class GhiFile implements IXuLyKetQua {
    private final String fileName;

    public GhiFile(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void xuLy(PhuongTrinhBac2 ptb) {
        try {
            FileWriter fileWriter =
                new FileWriter(fileName);

            BufferedWriter bufferedWriter;
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuilder b = new StringBuilder();
            b.append(ptb.inPhuongTrinh())
                    .append(ptb.getKetQua());
                    
            bufferedWriter.write(b.toString());

            bufferedWriter.close();
            File file = new File(fileName);
            System.out.println("Ghi file thành công!\nĐường dẫn: " + file.getAbsolutePath());
        }
        catch(IOException ex) {
            System.out.println(
                "Lỗi ghi file '"
                + fileName + "'");
        }
    }
}
