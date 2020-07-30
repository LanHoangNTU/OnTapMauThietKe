/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator.genericiterator;

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
        Integer arr[] = new Integer[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        Aggregate<Integer> agg = new ArrayAggregate<>(arr);
        Iterator<Integer> ite = agg.createIterator();
        
        int x = ite.currentItem();
        System.out.println("Current: \n\tTitle: " + x + "\n\tBody: " + x);
        x = ite.next();
        System.out.println("Next: \n\tTitle: " + x + "\n\tBody: " + x);
        x = ite.first();
        System.out.println("First: \n\tTitle: " + x + "\n\tBody: " + x);
        x = ite.currentItem();
        System.out.println("Current: \n\tTitle: " + x + "\n\tBody: " + x);
    }
    
}
