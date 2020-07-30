/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.beverage;

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
        Beverage dr = new DarkRoast("Dark Roast");
        System.out.println(dr.getDescription() + " - Cost: " + dr.cost());
        dr = new Milk(dr, "Dark Roast with Milk");
        System.out.println(dr.getDescription() + " - Cost: " + dr.cost());
        dr = new Mocha(dr, "Dark Roast with Milk and Mocha");
        System.out.println(dr.getDescription() + " - Cost: " + dr.cost());
    }
    
}
