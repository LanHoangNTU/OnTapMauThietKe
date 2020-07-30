/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.document;

/**
 *
 * @author Lân
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocumentInvolker involker = new DocumentInvolker();
        involker.write("Try so hard");
        involker.write(" and got so far");
        involker.read();
        involker.undo();        involker.undo();
        involker.undo();
        involker.redo();
        involker.read();
        involker.write(" and holy fuck, it worked!");
        involker.read();
    }
    
}
