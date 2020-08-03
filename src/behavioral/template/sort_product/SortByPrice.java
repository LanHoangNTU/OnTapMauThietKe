/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.template.sort_product;

/**
 *
 * @author Lân
 */
public class SortByPrice extends SortCollection{

    @Override
    protected int compare(Product p1, Product p2) {
        int pr1 = p1.getPrice();
        int pr2 = p2.getPrice();
        if (pr1 > pr2) {
            return 1;
        }
        else if (pr1 < pr2) {
            return -1;
        }
        else
            return 0;
    }
    
}
