/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package groupproject1;

import java.io.File;
import java.util.Scanner;

/**
 * @author Eric Martin
 */
public class main {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        // Ask user if they'd like to export to Drive, print, email, or download
        System.out.println("Enter 1 for Email, 2 for Download, 3 for Print, or 4 for Send to Google Drive");
        String num = userInput.nextLine();
        int number = Integer.parseInt(num);

        // If user input is 1, email a file
        // If user input is 2, download the file
        // If user input is 3, print the file
        // If user input is 4, send the file to Google Drive
        if (number == 1) {
            System.out.println("Please enter the path of the file you'd like to email: ");
            String input_file = userInput.nextLine();
            Email email = new Email(); // Create an instance of Email
            File email_file = new File(input_file);
            email.getContent(email_file);
        } else if (number == 2) {
            Downloader dlnotes = new Downloader(); // Create an instance of Downloader
            dlnotes.selectFileType(); //starts the downloader choose file method
        } else if (number == 3) {
            File file = new File("/Users/ericmartin/Downloads/ESOF_322/esof322_groupProject1/notes.txt"); // file where notes were taken
            Print notes = new Print(); // Create an instance of Print
            notes.getContent(file); // sends notes into print
        } else if (number == 4) {
            System.out.println("Please enter the path of the file you'd like to email: ");
            String input_file = userInput.nextLine();
            SendToDrive drive = new SendToDrive(); // Create an instance of SendToDrive
            File drive_file = new File(input_file);
            drive.getContent(drive_file);
        } else {
            // Ask user to input a correct number
            System.out.println("Please enter 1, 2, 3, or 4");
        }

    }

}
