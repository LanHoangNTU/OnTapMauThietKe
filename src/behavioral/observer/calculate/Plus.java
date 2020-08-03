/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.calculate;

/**
 *
 * @author Lân
 */
public class Plus implements ICalculate{

    @Override
    public void execute(int a, int b) {
        int sum = a + b;
        System.out.println("" + a + " + " + b + " = " + sum);
    }
    
}
