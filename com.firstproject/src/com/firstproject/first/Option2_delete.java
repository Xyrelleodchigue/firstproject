package com.firstproject.first;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Option2_delete {
	
	public void deleteFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Delete File");
		
		 System.out.print("Enter Filename to be deleted:");                    // Ask for the file name
		    String fileName = sc.next();
		    File deleteFile = new File("c://temp//"+fileName);
		    if (deleteFile.delete()) {
	            System.out.println("File deleted successfully");
	        }
	        else {
	            System.out.println("Failed to delete the file");
	        }
		    Main main = new Main();
		    main.mainMenu();
	}

}
