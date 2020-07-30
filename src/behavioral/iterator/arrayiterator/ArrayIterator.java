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
public class ArrayIterator extends Iterator{
    private ArrayAggregate aggregate;
    private int position;

    public ArrayIterator(ArrayAggregate aggregate) {
        this.aggregate = aggregate;
        this.position = 0;
    }
    
    @Override
    public int first() {
        this.position = 0;
        return aggregate.getItem(0);
    }

    @Override
    public int next() {
        if(!this.isDone()){
            this.position += 1;
            return aggregate.getItem(position);
        }
        return this.first();
    }

    @Override
    public boolean isDone() {
        return this.position == aggregate.count() - 1;
    } 

    @Override
    public int currentItem() {
        return this.aggregate.getItem(position);
    }
    
}
