/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.document;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class Document {
    List<String> stack = new ArrayList<>();

    public Document() {
    }
    
    public void push(String s){
        stack.add(s);
    }
    
    public void pop(){
        if(!isEmpty())
            stack.remove(stack.get(stack.size() - 1));
    }
    
    private boolean isEmpty(){
        return stack.size() <= 0;
    }
    
    public String read(){
        StringBuilder b = new StringBuilder();
        for (String s : stack) {
            b.append(s);
        }
        
        return b.toString();
    }
}
