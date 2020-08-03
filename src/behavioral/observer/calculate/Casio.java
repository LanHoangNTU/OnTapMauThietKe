/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.calculate;

/**
 *
 * @author Lân
 */
public class Casio {
    private ICalculate strategy;

    public void setStrategy(ICalculate strategy) {
        this.strategy = strategy;
    }
    
    public void calculate(int a, int b){
        strategy.execute(a, b);
    }
}
