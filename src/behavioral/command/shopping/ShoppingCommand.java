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
public class ShoppingCommand extends Command{
    private CartInfo cartInfo;
    private Store store;

    public ShoppingCommand(CartInfo cartInfo, Store store) {
        this.cartInfo = cartInfo;
        this.store = store;
    }
    
    @Override
    public void order() {
        System.out.println(store.purchase(cartInfo));
    }
    
    @Override
    public void unOrder(){
        System.out.println(store.removeItem(cartInfo));
    }

    @Override
    public void print() {
        System.out.println(store.getCartInfos(cartInfo));
    }
}