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
public class User implements Game.ISaleListener{
    private int preference;
    private String name;

    public User(int preference, String name) {
        this.preference = preference;
        this.name = name;
    }

    @Override
    public void subcribe(Game automata) {
        automata.attach(this);
    }

    @Override
    public void unsubcribe(Game automata) {
        automata.dettach(this);
    }

    @Override
    public void notifySale(int price) {
        if (price <= preference) {
            System.out.println(name + ": Buy!");
        }
        else{
            System.out.println(name + ": Continue waiting...");
        }
    }
    
}
