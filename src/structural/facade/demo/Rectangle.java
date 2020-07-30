/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.facade.demo;

/**
 *
 * @author Lân
 */
public class Rectangle implements ShapeFacade{

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}
