package groupproject1;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;


public class print  {

    public print (String str) throws Exception {
        File output = new File("/Users/lillianbentley/esof322/esof322_groupProject1/printPreview.txt");
        FileWriter writer = new FileWriter(output);

        writer.write(str);
        writer.flush();
        writer.close();

    }

}