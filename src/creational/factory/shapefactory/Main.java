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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape t1 = shapeFactory.createShape(ShapeType.triangle);
        
        System.out.println("t1: " + t1.draw());
        
        ShapeFactorySingleton singleton1 = ShapeFactorySingleton.createInstance();
        ShapeFactorySingleton singleton2 = ShapeFactorySingleton.createInstance();
        
        singleton1.setType(ShapeType.circle);
        Shape h1 = singleton1.createShape();
        System.out.println(h1.draw());
        
        singleton2.setType(ShapeType.rectangle);
        h1 = singleton1.createShape();
        Shape h2 = singleton2.createShape();
        System.out.println(h2.draw());
        System.out.println(h1.draw());
    }
    
}