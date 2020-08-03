/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.template.sort_product;

import java.util.ArrayList;
import java.util.List;

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
        List<Product> list = new ArrayList<>();
        list.add(new Product("A", 1000, 0));
        list.add(new Product("D", 4000, 0));
        list.add(new Product("B", 500, 0));
        list.add(new Product("F", 6000, 0));
        list.add(new Product("E", 60, 0));
        list.add(new Product("D", 1000, 0));
        
        System.out.println("Before");
        for (Product product : list) {
            System.out.println(product.toString());
        }
        
        SortCollection sc = new SortByPrice();
        sc.sort(list);
        
        System.out.println("After (by price)");
        for (Product product : list) {
            System.out.println(product.toString());
        }
        
        SortCollection sc2 = new SortByName();
        sc2.sort(list);
        
        System.out.println("After (by name)");
        for (Product product : list) {
            System.out.println(product.toString());
        }
    }
    
}
