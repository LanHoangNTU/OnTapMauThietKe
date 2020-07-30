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
public class DarkRoast extends Beverage{

    public DarkRoast(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 20000;
    }
    
}
