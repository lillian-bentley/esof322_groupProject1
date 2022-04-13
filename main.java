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

        File file = new File("/Users/lillianbentley/esof322/esof322_groupProject1/notes.txt");
        Scanner sc = new Scanner(file);
        StringBuilder str = new StringBuilder();

        while (sc.hasNextLine())
            str.append(sc.nextLine());

        String send = str.toString();
        //System.out.println(sc.nextLine());

        print notes = new print(send);
    }

}
