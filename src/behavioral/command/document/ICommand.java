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
public interface ICommand {
    public void execute(String text, Document document);
    public void undo();
    public void redo();
}
