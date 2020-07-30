/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.pt_bac_2.nhapthamso;

import java.util.Scanner;

/**
 *
 * @author Lân
 */
public class TuManHinh implements INhapThamSo{

    @Override
    public int[] nhapThamSo() {
        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        arr[0] = scanner.nextInt();
        System.out.print("Nhập b: ");
        arr[1] = scanner.nextInt();
        System.out.print("Nhập c: ");
        arr[2] = scanner.nextInt();
        
        return arr;
    }
    
}
