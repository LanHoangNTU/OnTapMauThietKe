/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.shopping;

/**
 *
 * @author Lân
 */
public abstract class Command {
    public abstract void order();
    public abstract void unOrder();
    public abstract void print();
}
