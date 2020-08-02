/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.sort_algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class MergeSort implements ISortingStrategy{

    public MergeSort() {
    }
    
    private void mergeSort(List<IComparable> comparables, int begin, int end){
        if (begin < end) {
            int mid = (begin + end)/2;
            mergeSort(comparables, begin, mid);
            mergeSort(comparables, mid + 1, end);
            merge(comparables, begin, mid, end);
        }
    }
    
    private void merge(List<IComparable> comparables, int begin, int middle, int end){
        List<IComparable> list = new ArrayList<>(comparables.subList(0, comparables.size()));
        int mid = middle + 1;
        int mBegin = begin;
        int tmp = begin;
        while(begin <= middle && mid <= end){
            int result = comparables.get(begin).compareTo(comparables.get(mid));
            if (result <= 0) {
                list.set(mBegin++, comparables.get(begin++));
            }
            else{
                list.set(mBegin++, comparables.get(mid++));
            }
        }
        
        while(mid <= end){
            list.set(mBegin++, comparables.get(mid++));
        }
        
        while(begin <= middle){
            list.set(mBegin++, comparables.get(begin++));
        }
        
        while(tmp <= end){
            comparables.set(tmp, list.get(tmp++));
        }
    }
    
    @Override
    public void sort(MyList list) {
        System.out.println("Merge sort");
        mergeSort(list.getComparables(), 0, list.getComparables().size() - 1);
    }
    
}
