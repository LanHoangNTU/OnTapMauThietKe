/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.numeral_system;

/**
 *
 * @author Lân
 */
public class Octal extends Converter.NumeralSystemListener{

    public Octal() {
    }
    
    @Override
    public void update() {
        StringBuilder b = new StringBuilder();
        int param = converter.getParam();
        b.append(param).append(" to octal is: ")
                .append(Integer.toOctalString(param))
                .append("\n");
        System.out.println(b.toString());
    }
    
}
