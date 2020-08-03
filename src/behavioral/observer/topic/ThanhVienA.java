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
public class ThanhVienA implements Topic.ITopicObserver{

    public ThanhVienA() {
    }

    public void login(Topic t){
        t.attach(this);
    }
    
    public void logout(Topic t){
        t.dettach(this);
    }
    
    @Override
    public void receiveNewTopic(String s) {
        System.out.println("New topic: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        System.out.println("Update topic at " + i + ": " + s);
    }
    
}
