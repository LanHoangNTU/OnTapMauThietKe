/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.topic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class ThanhVienB implements Topic.ITopicObserver{
    private List<String> list = new ArrayList<>();
    
    public ThanhVienB() {
    }

    public void login(Topic t){
        t.attach(this);
        //list = t.getTopics();
        list.addAll(t.getTopics());
    }
    
    public void logout(Topic t){
        t.dettach(this);
    }
    
    @Override
    public void receiveNewTopic(String s) {
        int size = list.size();
        list.add(s);
        for (int i = 0; i < size; i++) {
            System.out.println("Tin " + i + ": " + list.get(i));
        }
        System.out.println("Tin moi: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        list.set(i, s);
        System.out.println("Tin duoc cap nhat o vi tri " + i + ": " + s);
    }
    
}
