/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject1;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

/**
 *
 * @author lillianbentley
 */

public class Printer {
    
    /**
     * ReceiveDocument to receive notes from print 
     * @param file
     * @throws Exception 
     */
    public void ReceiveDocument(File file) throws Exception {
        Scanner sc = new Scanner(file); 
        StringBuilder str = new StringBuilder();

        while (sc.hasNextLine()) // goes through each line of the file
            str.append(sc.nextLine());
        
        String send = str.toString(); // creates a string to be printed into the preview
        Print(send);
    }
    
    /**
     * Print prints out the document into a print preview
     * @param str
     * @throws Exception 
     */
    public void Print(String str) throws Exception {
        File output = new File("/Users/lillianbentley/NetBeansProjects/GroupProject1/src/groupproject1/printPreview.txt"); // initializes print preview file
        FileWriter writer = new FileWriter(output);

        writer.write(str); // takes notes and puts it into the print preview
        writer.flush();
        writer.close();
    }
    
}