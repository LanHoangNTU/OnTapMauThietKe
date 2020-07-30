/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.game_sale;

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
        Game automata = new Game(800000);
        User u1 = new User(400000, "Heca");
        User u2 = new User(600000, "Lazuli");
        u1.subcribe(automata);
        automata.attach(u2);
        automata.updateSale(10);
        automata.updateSale(40);
    }
    
}
