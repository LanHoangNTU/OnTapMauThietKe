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
public class Milk extends CondimentDecorator{

    public Milk(Beverage component, String description) {
        super(component, description);
    }

    @Override
    public int cost() {
        return component.cost() + 7000;
    }
    
}
