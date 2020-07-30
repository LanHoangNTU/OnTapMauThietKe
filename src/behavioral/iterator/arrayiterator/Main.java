/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator.arrayiterator;

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
	int[] arr = {1, 2, 3, 4 ,5};
		
	ArrayAggregate aggregate = new ArrayAggregate(arr);
        ArrayIterator iterator = new ArrayIterator(aggregate);
        
        System.out.println("Current: " + iterator.currentItem());
        System.out.println("Next: " + iterator.next());
        System.out.println("Current: " + iterator.currentItem());
        while(!iterator.isDone()){
            iterator.next();
        }
        System.out.println("Current: " + iterator.currentItem());
        System.out.println("First: " + iterator.first());
        System.out.println("Current: " + iterator.currentItem());
    }
    
}
