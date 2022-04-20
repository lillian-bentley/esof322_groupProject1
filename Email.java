import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Eric Martin
 */
public class Email extends Export {

    EmailAccount email_account = new EmailAccount(); // Create an instance of the EmailAccount interface

    public void getContent(File file) {
        email_account.getAccountInfo();
        System.out.println("Adding file");

        File email_file = new File("email.txt");
        Scanner sc = null;
        StringBuilder str = new StringBuilder();
        try {
            sc = new Scanner(file);
            // Open the file where the email is being created
            FileWriter writer = new FileWriter(email_file, true);

            // Read the file of the email being attached
            while (sc.hasNextLine()) {
                str.append(sc.nextLine());
            }
            // Write the attached file to the email
            String full_file = str.toString();
            writer.write(full_file);
            writer.close();
            System.out.println("File has been attached to the email");
            System.out.println("Email has been sent");
        } catch (FileNotFoundException e) { // File catch exception
            e.printStackTrace();
        } catch (IOException e) { // FileWriter catch exception
            e.printStackTrace();
        }
    }
}
