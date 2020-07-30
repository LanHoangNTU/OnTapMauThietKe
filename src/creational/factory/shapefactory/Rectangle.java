/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory.shapefactory;

/**
 *
 * @author Lân
 */
public class Rectangle extends Shape{

    protected Rectangle() {
        this.brush = "\nBrush: Pencil";
        this.paper = "\nPaper: Normal paper";
        this.frame = "\nFrame: Iron";
    }

    @Override
    public String draw() {
        StringBuilder b = new StringBuilder();
        b.append("- This is a Rectangle").append(this.brush)
                .append(this.paper)
                .append(this.frame);
        return b.toString();       
    }
}
