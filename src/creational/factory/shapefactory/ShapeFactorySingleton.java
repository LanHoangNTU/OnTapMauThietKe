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
public class ShapeFactorySingleton {
    private static ShapeFactorySingleton instance;
    ShapeType type;

    public ShapeType getType() {
        return type;
    }

    public void setType(ShapeType type) {
        this.type = type;
    }
    
    public ShapeFactorySingleton() {
    }
    
    public static ShapeFactorySingleton createInstance(){
        if(instance == null)
            instance = new ShapeFactorySingleton();
        return instance;
    }
    
    public Shape createShape(){
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
