import java.util.Scanner;

/**
 * @author Randall Martin
 */
public class DriveAccount implements UserAccountDatabase {

    public void getAccountInfo() {
        Scanner googleLogin = new Scanner(System.in);

        // Store user information for Google username and password
        System.out.println("Enter your Google email: ");
        String username = googleLogin.nextLine();           // Save Google Login
        System.out.println("Enter your Google password: ");
        String password = googleLogin.nextLine();           // Save Google Password

        // Send the account information to the login() method to log into the drive account
        login(username, password);

        System.out.println("Added to Google Drive");
    }

    // Login to the Drive Account
    public void login(String username, String password) {
        System.out.println("Logging in.... you are logged in!");
    }

}
