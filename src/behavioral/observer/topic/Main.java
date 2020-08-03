/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.topic;

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
        Topic t = new Topic();
        ThanhVienA a = new ThanhVienA();
        ThanhVienB b = new ThanhVienB();
        a.login(t);
        b.login(t);
        
        t.addTopic("OOP");
        System.out.println("-------------------------------------");
        t.addTopic("DOP");
    }
    
}
