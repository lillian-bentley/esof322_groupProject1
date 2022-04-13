/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject1;

import java.io.File;

/**
 *
 * @author lillianbentley
 */
public class Print {
    
    public void getContent(File file) throws Exception {
        Printer notes = new Printer();
        notes.ReceiveDocument(file);
    }
    
}