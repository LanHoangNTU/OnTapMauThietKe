/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.caythumuc;

/**
 *
 * @author Lân
 */
public abstract class AbstractFile {
    //Variables
    protected String name;
    protected String path;
    /*
     *String prefix = "";
    */
    
    //Constructors

    public AbstractFile(String name) {
        this.name = name;
        this.path = name;
    }
    
    //Functions
    public abstract void add (AbstractFile f);
    public abstract void remove (AbstractFile f);
    public abstract String getTreeFolder(String s);

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }
}
