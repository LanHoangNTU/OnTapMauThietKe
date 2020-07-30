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
public class DashedBorder extends ShapeDecorator{

    public DashedBorder(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return shape.draw() + "\nBorder style: Dashed";
    }
    
}
