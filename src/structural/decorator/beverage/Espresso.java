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
public class Espresso extends Beverage{

    public Espresso(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 44000;
    }
    
}
