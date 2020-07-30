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
public abstract class Shape {
    protected String brush;
    protected String paper;
    protected String frame;

    public Shape() {
    }

    public abstract String draw();
}
