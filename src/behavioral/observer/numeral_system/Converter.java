/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.numeral_system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class Converter {
    private List<NumeralSystemListener> listeners = new ArrayList<>();
    private int param;

    public Converter() {
    }
    
    public void attach(NumeralSystemListener listener){
        if (!listeners.contains(listener)) {
            listeners.add(listener);
            listener.setConverter(this);
        }
    }

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
        notifyListeners();
    }
    
    public void notifyListeners(){
        for (NumeralSystemListener listener : listeners) {
            listener.update();
        }
    }
    
    public static abstract class NumeralSystemListener{
        protected Converter converter;
        public void setConverter(Converter converter){
            this.converter = converter;
            converter.attach(this);
        }
        public abstract void update();
    }
}
