/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.caythumuc;

import java.util.ArrayList;

/**
 *
 * @author Lân
 */
public class Folder extends AbstractFile{
    //Variables
    private final ArrayList<AbstractFile> abstractFiles;

    //Constructors
    public Folder(String name) {
        super(name);
        this.abstractFiles = new ArrayList<>();
    }

    //Functions
    @Override
    public void add(AbstractFile f) {
        if(!this.abstractFiles.contains(f)){
            this.abstractFiles.add(f);
            f.setPath(path + "\\" + f.getPath());
            /*
            * f.prefix = this.prefix + "   ";
            */
        }
        else
            return;
    }

    @Override
    public void remove(AbstractFile f) {
        if(abstractFiles.contains(f)){
            this.abstractFiles.remove(f);
            return;
        }
        for (AbstractFile fo : abstractFiles) {
                fo.remove(f);
        }
        
    }

    @Override
    public String getTreeFolder(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s).append(this.name);
        this.abstractFiles.forEach((f) -> {
            builder.append("\n").append(f.getTreeFolder(s + "   "));
        });
        return builder.toString();
    }
}
