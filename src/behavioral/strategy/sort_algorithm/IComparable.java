/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.sort_algorithm;

/**
 *
 * @author Lân
 */
public interface IComparable {
/**
 * Returns the result after comparing 2 IComparable objects
 * <p>
 * Compares this IComparable object to another IComparable object
 * @param comparable    IComparable object for comparison
 * @return 1 if this is greater than another object, -1 if less and 0 if equals
*/
    public int compareTo(IComparable comparable);
}
