/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.sort_algorithm;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lân
 */
public class QuickSort implements ISortingStrategy{

    public QuickSort() {
    }
    
    private int partition(List<IComparable> comps, int begin, int end) {
	IComparable pivot = comps.get(end);
	int i = (begin-1);
	 
	for (int j = begin; j < end; j++) {
	    if (comps.get(j).compareTo(pivot) == -1) {
	        i++;
                Collections.swap(comps, i, j);
	    }
	}
	
        Collections.swap(comps, i+1, end);
	 
	return i+1;
    }
    private void quickSort(List<IComparable> comps, int begin, int end){
        if (begin < end) {
            int partitionIndex = partition(comps, begin, end);
	 
            quickSort(comps, begin, partitionIndex-1);
            quickSort(comps, partitionIndex+1, end);
	}
    }
    @Override
    public void sort(MyList list) {
        var comps = list.getComparables();
        System.out.println("Quick sort");
        quickSort(comps, 0, comps.size() - 1);
    }
    
}
