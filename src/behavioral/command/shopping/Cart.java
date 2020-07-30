/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.shopping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class Cart {
    List<Command> list = new ArrayList<>();
    Store st = new Store();
    int current;

    public Cart() {
        current = -1;
    }
    
    public void themVaoGioHang(CartInfo cartInfo){
        Command ctgh = new ShoppingCommand(cartInfo, st);
        ctgh.order();
        add(ctgh);
    }
    
    private void add(Command c){
        if (!list.contains(c)) {
            int i = list.size() - 1;
            while(i > current){
                list.remove(i);
                i--;
            }
            list.add(c);
            current += 1;
        }
    }
    
    public void undo(){
        if (current >= 0) {
            System.out.println("Undo: ");
            list.get(current).unOrder();
            current -= 1;
        }
    }
    
    public void redo(){
        if (current < list.size() - 1) {
            current += 1;
            System.out.println("Undo: ");
            list.get(current).order();
        }
    }
    
    public void xemGioHang(){
        for (int i = 0; i <= current; i++) {
            list.get(i).print();
        }
    }
    
    public void tinhTienGioHang(){
        System.out.println(st.getTotal());
    }
}