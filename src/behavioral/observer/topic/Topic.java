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
public class Topic {
    private List<String> topics = new ArrayList<>();
    private List<ITopicObserver> observers = new ArrayList<>();

    public List<String> getTopics() {
        return topics;
    }
    
    public void attach(ITopicObserver observer){
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }
    
    public void dettach(ITopicObserver observer){
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }
    
    public void addTopic(String s){
        topics.add(s);
        for (ITopicObserver observer : observers) {
            observer.receiveNewTopic(s);
        }
    }
    
    public void updateTopic(int i, String s){
        topics.set(i, s);
        for (ITopicObserver observer : observers) {
            observer.updateTopic(i, s);
        }
    }
    
    public static interface ITopicObserver{
        public void receiveNewTopic(String s);
        public void updateTopic(int i, String s);
    }
}
