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
public class Store {
    private int sum;
    private String cartInfos;

    public Store() {
        this.sum = 0;
    }
    
    public String operate(CartDetails cartDetails){
        StringBuilder b = new StringBuilder();
        Product p = cartDetails.getProduct();
        int amount = cartDetails.getAmount();
        int price = amount * p.getPrice();
        sum += price;
        return b.append("Name: ").append(p.getName())
                .append("\nPrice: ").append(p.getPrice())
                .append("\nAmount: ").append(amount)
                .append("\nTotal: ").append(price)
                .append("\n_____________________________")
                .toString();
    }
    
    public int getTotal(){
        return sum;
    }
}
