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
public class ArrayAggregate extends Aggregate{
    private int[] arr;

    public ArrayAggregate(int[] arr) {
        this.arr = arr;
    }
    
    public int count(){
        return this.arr.length;
    }
    
    public int getItem(int i){
        return arr[i];
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this); 
    }
    
}
