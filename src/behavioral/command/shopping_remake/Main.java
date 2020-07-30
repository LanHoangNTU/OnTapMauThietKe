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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cart cart = new Cart();
        Product dell = new Product("Dell Vostro 13", 12000000);
        Product mac = new Product("Mac Book Air", 43000000);

        cart.addToCart(new CartDetails(mac, 1));
        cart.addToCart(new CartDetails(dell, 1));
        cart.addToCart(new CartDetails(mac, 4));
        System.out.println("Total: " + cart.getTotal());
    }
    
}
