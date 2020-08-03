/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.template.sort_product;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lân
 */
public abstract class SortCollection {
    public SortCollection() {
    }
    
    protected abstract int compare(Product p1, Product p2);
    
    public void sort(List<Product> list){ 
        for  ( int  i =  0 ; i <list.size() -  1 ; i ++) {  
            for  ( int  j =  0 ; j < list.size() -  1  - i; j ++) {
                if  (compare(list.get(j), list.get(j + 1)) == 1) {  
                    Collections.swap(list, j, j + 1);
                }  
            }  
        }
    }
}
