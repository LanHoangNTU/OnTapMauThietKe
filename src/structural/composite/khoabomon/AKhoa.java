/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.khoabomon;

/**
 *
 * @author Lân
 */
public abstract class AKhoa {
    protected String name;
    protected String parents;

    public AKhoa() {
    }

    public AKhoa(String name) {
        this.name = name;
        this.parents = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }
    
    public abstract void add(AKhoa entity);
    public abstract void remove(AKhoa entity);
    public abstract String getHierarchy(String s);
}
