/**
 * @author Lillian Bentley
 */

import java.io.File;

/**
 * @author lillianbentley
 */
public class Print extends Export {

    NoAccount no = new NoAccount();

    /**
     * getContent() gets the file from the test to send to the printer
     *
     * @param file -- note file
     * @throws Exception in case file is not found
     **/
    public void getContent(File file) {
        Printer notes = new Printer(); // initializes the printer class
        try {
            notes.ReceiveDocument(file); // sends the file into the printer
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
