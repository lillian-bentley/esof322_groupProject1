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
    public void ReceiveDocument(File file) throws Exception {
        Scanner sc = new Scanner(file);
        StringBuilder str = new StringBuilder();

        while (sc.hasNextLine())
            str.append(sc.nextLine());
        
        String send = str.toString();
        Print(send);
    }
    
    public void Print(String str) throws Exception {
        File output = new File("/Users/lillianbentley/NetBeansProjects/GroupProject1/src/groupproject1/printPreview.txt");
        FileWriter writer = new FileWriter(output);

        writer.write(str);
        writer.flush();
        writer.close();
    }
    
}