/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.shapes;

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
        Shape c = new Circle();
        System.out.println(c.draw());
        c = new DashedBorder(c);
        System.out.println(c.draw());
        c = new RedBorder(c);
        System.out.println(c.draw());
    }
    
}
