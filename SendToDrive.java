import java.io.File;

/**
 * @author Randall Martin
 */
public class SendToDrive {

    DriveAccount drive = new DriveAccount(); // Create an instance of the DriveAccount interface

    public void getContent(File file) {
        drive.getAccountInfo(); // Receive login username and password for Drive account

        System.out.println(file.toString() + " has been sent to Google Drive!");
    }

}
