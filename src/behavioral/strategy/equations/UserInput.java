/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.equations;

import java.util.Scanner;

/**
 *
 * @author Lân
 */
public class UserInput implements IInput{

    @Override
    public int[] getParameters(Equation e) {
        int power = e.getPower() + 1;
        int[] arr = new int[power];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < power; i++) {
            if(i>0)
                System.out.print("Enter next param: ");
            else
                System.out.print("Enter param: ");
            arr[i] = scanner.nextInt();
        }
        
        return arr;
    }
    
}
