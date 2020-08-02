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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<IComparable> comparables = new ArrayList<>();
        comparables.add(new BMI(152, 60));
        comparables.add(new BMI(154, 60));
        comparables.add(new BMI(155, 60));
        comparables.add(new BMI(170, 60));
        comparables.add(new BMI(130, 60));
        comparables.add(new BMI(180, 60));
        MyList list = new MyList(comparables);
        list.setStrategy(new MergeSort());
        list.sort();
        for (IComparable comparable : list.getComparables()) {
            System.out.println(((BMI) comparable).getBMI());
        }
    }
    
}
