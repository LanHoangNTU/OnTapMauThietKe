/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.khoabomon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class BoMon extends AKhoa{
    private final List<AKhoa> list = new ArrayList<>();

    public BoMon() {
    }

    public BoMon(String name) {
        super(name);
    }
    
    @Override
    public void add(AKhoa entity) {
        if(!list.contains(entity)){
            list.add(entity);
            entity.setParents(parents + "-" +entity.getParents());
        }
    }

    @Override
    public void remove(AKhoa entity) {
        if(list.contains(entity)){
            list.remove(entity);
            return;
        }
        list.forEach((item) -> {
            item.remove(entity);
        });
    }

    @Override
    public String getHierarchy(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s).append(this.name);
        list.forEach((f) -> {
            builder.append("\n").append(f.getHierarchy(" " + s));
        });
        return builder.toString();
    }
}
