/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.sort_algorithm;

import java.util.List;

/**
 *
 * @author Lân
 */
public class MyList {
    private ISortingStrategy strategy;
    private List<IComparable> comparables;

    public MyList(List<IComparable> comparables) {
        this.comparables = comparables;
    }
    
    public void sort(){
        strategy.sort(this);
    }

    public List<IComparable> getComparables() {
        return comparables;
    }

    public ISortingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ISortingStrategy strategy) {
        this.strategy = strategy;
    }
}
