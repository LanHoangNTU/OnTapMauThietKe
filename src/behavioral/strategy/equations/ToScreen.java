/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.equations;

/**
 *
 * @author Lân
 */
public class ToScreen implements IOutput{

    @Override
    public void out(String str) {
        System.out.println(str);
    }
    
}
