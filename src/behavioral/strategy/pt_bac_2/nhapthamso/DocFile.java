/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.pt_bac_2.nhapthamso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Lân
 */
public class DocFile implements INhapThamSo{
    private String fileName;

    public DocFile(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public int[] nhapThamSo() {
        try {
            int[] arr = new int[3];
            int i = 0;
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              arr[i] = myReader.nextInt();
              i+=1;
            }
            myReader.close();
            return arr;
        }
        catch (FileNotFoundException e) {
            System.out.println("Đã có lỗi xảy ra");
            return new int[]{0, 0, 0};
        }
    }
    
}
