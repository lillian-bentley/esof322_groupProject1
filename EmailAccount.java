import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Eric Martin
 */
public class EmailAccount implements UserAccountDatabase {

    public void getAccountInfo() {
        // Grab user info, including the sending and receiving email,
        // subject, and body. Write these to a text file to act as the draft email
        Scanner fileScan = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = fileScan.nextLine();
        System.out.println("Enter your password: ");
        String password = fileScan.nextLine();
        
        // Send the account information to the login() method to log into the drive account
        login(email, password);
        System.out.println("Enter receiving email: ");
        String rec_email = fileScan.nextLine();
        System.out.println("Enter subject: ");
        String subject = fileScan.nextLine();
        System.out.println("Enter body: ");
        String body = fileScan.nextLine();

        // Write the draft email, with the attached file to be added later
        FileWriter email_file = null;
        try {
            email_file = new FileWriter("email.txt");
            email_file.write("To: " + rec_email + '\n');
            email_file.write("From: " + email + '\n');
            email_file.write("Subject: " + subject + "\n\n");
            email_file.write(body + "\n\n");
            email_file.close();
            System.out.println("Subject added");
        } catch (IOException e) {
            e.printStackTrace(); // Exception for if the file doesn't exist
        }


    }

    // Login to the Drive Account
    public void login(String email, String password) {
        System.out.println("Logging in.... you are logged in!");
    }
}
