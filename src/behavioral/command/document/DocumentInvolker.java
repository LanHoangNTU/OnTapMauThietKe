/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.document;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class DocumentInvolker {
    private Document doc = new Document();
    List<ICommand> commands = new ArrayList<>();
    private int pos = -1;

    public DocumentInvolker() {
    }
    
    public void write(String text){
        ICommand c = new DocumentCommand();
        c.execute(text, doc);
        int i = commands.size() - 1;
        while(i > pos){
            commands.remove(i);
            i -= 1;
        }
        pos += 1;
        commands.add(c);
    }
    
    public void undo(){
        if (pos > -1) {
            commands.get(pos).undo();
            pos -= 1;
        }
    }
    
    public void redo(){
        if (pos < commands.size() - 1) {
            pos += 1;
            commands.get(pos).redo();
        }
    }
    
    public void read(){
        System.out.println(doc.read());
    }
}
