/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.shopping_remake;

/**
 *
 * @author Lân
 */
public class CartCommand implements ICommand{
    private CartDetails cd;
    private Store store;

    public CartCommand(CartDetails cd, Store store) {
        this.cd = cd;
        this.store = store;
    }
    
    
    @Override
    public void order() {
        System.out.println(store.operate(cd));
    }
    
}
