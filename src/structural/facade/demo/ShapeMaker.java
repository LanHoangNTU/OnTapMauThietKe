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
public class ShapeMaker {
    private ShapeFacade square;
    private ShapeFacade rectangle;

    public ShapeMaker() {
        this.square = new Rectangle();
        this.rectangle = new Square();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
    
    public void drawSquare(){
        square.draw();
    }
}
