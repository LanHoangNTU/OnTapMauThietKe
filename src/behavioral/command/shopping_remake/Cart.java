/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.shopping_remake;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class Cart {
    private List<ICommand> commands = new ArrayList<>();
    private Store store = new Store();

    public Cart() {
    }
    
    public void addToCart(CartDetails cd){
        ICommand c = new CartCommand(cd, store);
        c.order();
        commands.add(c);
    }
    
    public int getTotal(){
        return store.getTotal();
    }
}
