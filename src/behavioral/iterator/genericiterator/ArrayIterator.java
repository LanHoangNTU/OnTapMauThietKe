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
public class ArrayIterator<T> extends Iterator<T>{
    private final ArrayAggregate<T> agg;
    private int pos;

    public ArrayIterator(ArrayAggregate<T> agg) {
        this.agg = agg;
        this.pos = 0;
    }

    @Override
    public T first() {
        pos = 0;
        return agg.getItemAt(pos);
    }

    @Override
    public T next() {
        if(!isDone()){
            pos += 1;
            return agg.getItemAt(pos);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return pos == agg.count() - 1;
    }

    @Override
    public T currentItem() {
        return agg.getItemAt(pos);
    }
}
