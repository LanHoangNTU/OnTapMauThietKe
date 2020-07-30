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
public class GiangVien extends AKhoa{

    public GiangVien() {
    }

    public GiangVien(String name) {
        super(name);
    }

    @Override
    public void add(AKhoa entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(AKhoa entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHierarchy(String s) {
        return s + name;
    }
    
}
