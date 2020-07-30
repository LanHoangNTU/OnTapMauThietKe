/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.shopping;

import java.util.List;

/**
 *
 * @author Lân
 */
public class Store {
    private int total = 0;
    
    public String purchase(CartInfo item){
        int tt = item.getPrice() * item.getAmount();
        StringBuilder b = new StringBuilder();
            total += tt;
            b.append(item.getName()).append(" - ")
                    .append(item.getAmount())
                    .append(" - ")
                    .append(item.getPrice())
                    .append(" - ")
                    .append(tt).append("\n");    
        return b.toString();
    }
    
    public String removeItem(CartInfo item){
        int tt = item.getPrice() * item.getAmount();
        StringBuilder b = new StringBuilder();
            total -= tt;
            b.append("Remove ")
                    .append(item.getName())
                    .append(" from cart.");
        return b.toString();
    }
    
    public String getCartInfos(CartInfo item){
        int tt = item.getPrice() * item.getAmount();
        StringBuilder b = new StringBuilder();
            b.append(item.getName()).append(" - ")
                    .append(item.getAmount())
                    .append(" - ")
                    .append(item.getPrice())
                    .append(" - ")
                    .append(tt).append("\n");    
        return b.toString();
    }
    
    public int getTotal(){
        return this.total;
    }
}
