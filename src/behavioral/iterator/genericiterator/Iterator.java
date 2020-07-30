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
public abstract class Iterator<T> {
    public abstract T first();
    public abstract T next();
    public abstract boolean isDone();
    public abstract T currentItem();
}
