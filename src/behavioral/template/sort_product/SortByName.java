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
public class SortByName extends SortCollection{

    @Override
    protected int compare(Product p1, Product p2) {
        int r = p1.getName().compareTo(p2.getName());
        if (r > 0) {
            return 1;
        }
        else if (r < 0) {
            return -1;
        }
        else
            return 0;
    }
    
}
