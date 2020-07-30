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
public class CartDetails {
    private Product product;
    private int amount;

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public CartDetails(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }
}
