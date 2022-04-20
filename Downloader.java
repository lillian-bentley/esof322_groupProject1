//package groupproject1;

import java.io.*;
import java.util.Scanner;

/**
 * @author Samuel Ertischek
 */

public class Downloader {

    NoAccount no = new NoAccount();

    /**
     * downloadFile downloads text from the input file to output file
     *
     * @param source      input file
     * @param destination output file
     * @throws IOException
     */
    public static void getContent(File source, File destination) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source); //load input file into inputstream
            os = new FileOutputStream(destination); //load output file into outputstream
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) //while there is text in the file write to the output file
            {
                os.write(buffer, 0, length);
            }

        } finally {
            is.close();

            os.close();
        }
    }


    /**
     * chooseFile asks for input and output file paths and types
     *
     * @throws Exception
     */
    public void selectFileType() throws Exception {
        Scanner fileScan = new Scanner(System.in);
        System.out.println("Enter input file path: "); //Ask for and get Input File
        String inFile = fileScan.nextLine();
        System.out.println("You entered " + inFile + " as your input file");
        File source = new File(inFile);
        System.out.println("Enter output path for downloaded file with the extension for the file type: "); //Ask for and get Output File
        String outFile = fileScan.nextLine();
        System.out.println("You entered " + outFile + " as your output file");
        File output = new File(outFile);

        getContent(source, output); //Call the download file method
    }
}
