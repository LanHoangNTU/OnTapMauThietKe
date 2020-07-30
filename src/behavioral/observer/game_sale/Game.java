/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.game_sale;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class Game {
    private int basePrice;
    private float sale;
    private List<ISaleListener> list = new ArrayList<>();

    public Game(int basePrice) {
        this.basePrice = basePrice;
        this.sale = 0;
    }
    
    public void attach(ISaleListener listener){
        if (list.contains(listener)) {
            System.out.println("You are already subcribed!");
        }
        else{
            list.add(listener);
            System.out.println("Subcribed to NierAutomata!");
        }
    }
    
    public void dettach(ISaleListener listener){
        if (list.contains(listener)) {
            list.remove(listener);
            System.out.println("Unsubcribed!");
        }
        else{
            System.out.println("You are not subcribing to NierAutomata!");
        }
    }
    
    public void updateSale(float sale){
        this.sale = sale;
        System.out.println("Sale: " + (basePrice - Math.round(basePrice * sale / 100)));
        notifyListeners();
    }

    private void notifyListeners() {
        int newPrice = basePrice - Math.round(basePrice * sale / 100);
        for (ISaleListener listener : list) {
            listener.notifySale(newPrice);
        }
    }
    
    public static interface ISaleListener{
        public void subcribe(Game automata);
        public void unsubcribe(Game automata);
        public void notifySale(int price);
    }
}
