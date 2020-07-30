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
public class ShapeFactory {

    public ShapeFactory() {
    }
    
    public Shape createShape(ShapeType type){
        switch(type){
            case circle:
                return new Circle();
            case rectangle:
                return new Rectangle();
            case triangle:
                return new Triangle();
        }
        return null;
    }
}
