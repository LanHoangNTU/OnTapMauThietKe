/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator.genericiterator;

/**
 *
 * @author Lân
 * @param <T>
 */
public class ArrayAggregate<T> extends Aggregate<T>{
    private final T arr[];

    public ArrayAggregate(T[] arr) {
        this.arr = arr;
    }

    public int count(){
        return arr.length;
    }
    
    public T getItemAt(int i){
        return arr[i];
    }
    
    @Override
    public Iterator<T> createIterator() {
        return new ArrayIterator<>(this);
    }
}
