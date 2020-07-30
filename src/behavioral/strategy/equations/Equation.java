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
public class Equation {
    private int[] parameters;
    private int power;
    private String result;
    private ISolver solver;
    private IInput input;
    private IOutput output;

    public Equation(int power) {
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setSolver(ISolver solver) {
        this.solver = solver;
    }

    public void setInput(IInput input) {
        this.input = input;
    }

    public void setOutput(IOutput output) {
        this.output = output;
    }
    
    public void getParameters(){
        parameters = input.getParameters(this);
    }
    
    public void solve(){
        result = solver.solve(parameters);
    }
    
    public void write(){
        output.out(result);
    }
}
