/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.equations;

/**
 *
 * @author Lân
 */
public class LinearEquationSolver implements ISolver{

    @Override
    public String solve(int[] params) {
        if (params.length < 2) {
            return "Error, must have 2 parameters!";
        }
        else{
            StringBuilder b = new StringBuilder("Results: ");
            if(params[0] == 0)
                b.append(params[1]);
            else{
                float result = -(float)params[1]/(float)params[0];
                b.append(result);
            }
            return b.toString();
        }
    }
    
}
