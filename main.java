/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author lillianbentley
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        File file = new File("/Users/lillianbentley/NetBeansProjects/GroupProject1/src/groupproject1/notes.txt");
        Print notes = new Print();
        notes.getContent(file);
      }

}
