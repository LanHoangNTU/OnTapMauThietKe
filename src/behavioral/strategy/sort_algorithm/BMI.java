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
public class BMI implements IComparable{
    private int height;
    private int weight;

    public BMI(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    
    public double getBMI(){
        return (double)weight / (Math.pow(height, 2));
    }

    @Override
    public int compareTo(IComparable comparable) {
        double myBMI = getBMI();
        double targetBMI = ((BMI)comparable).getBMI();
        if (myBMI > targetBMI) {
            return 1;
        }
        else if(myBMI < targetBMI)
            return -1;
        else
            return 0;
    }
}
