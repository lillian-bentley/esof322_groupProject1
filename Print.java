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
    
    /**
     * getContent() gets the file from the test to send to the printer
     * @throws Exception in case file is not found
     * @param file -- note file
     * 
     **/
    public void getContent(File file) throws Exception {
        Printer notes = new Printer(); // initializes the printer class
        notes.ReceiveDocument(file); // sends the file into the printer
    }
    
}