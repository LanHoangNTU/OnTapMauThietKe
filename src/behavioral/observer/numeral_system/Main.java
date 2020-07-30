/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.numeral_system;

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
        Converter c = new Converter();
        c.attach(new Binary());
        c.attach(new Octal());
        c.attach(new Hexa());
        c.setParam(10);
        c.setParam(999);
    }
    
}
