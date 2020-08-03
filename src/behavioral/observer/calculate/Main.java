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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Casio c = new Casio();
        c.setStrategy(new Subtract());
        c.calculate(10, 5);
        
        c.setStrategy(new Plus());
        c.calculate(10, 5);
    }
    
}
