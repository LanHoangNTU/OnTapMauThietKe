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
public class DocumentCommand implements ICommand{
    private String text;
    private Document document;

    public DocumentCommand() {
    }
    
    @Override
    public void execute(String text, Document document) {
        this.text = text;
        this.document = document;
        document.push(text);
    }

    @Override
    public void undo() {
        document.pop();
    }

    @Override
    public void redo() {
        document.push(text);
    }
}
