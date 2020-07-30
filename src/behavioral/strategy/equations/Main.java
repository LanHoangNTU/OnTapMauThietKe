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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equation e = new Equation(1);
        e.setInput(new UserInput());
        e.setSolver(new LinearEquationSolver());
        e.setOutput(new ToScreen());
        e.getParameters();
        e.solve();
        e.write();
    }
    
}
