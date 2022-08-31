package com.firstproject.first;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Option2_add {
	
	public void add_files() throws IOException {
		Scanner sc = new Scanner(System.in);
		String options2 = "";
		
		System.out.print("Enter New Filename-->"); 
		String newFileName = sc.next();
		File newFile = new File("c://temp//"+newFileName+".txt");
		if (newFile.createNewFile()) {
            System.out.println("File created successfully");
        }
        else {
            System.out.println("Failed to create the file");
        }
		
		//System.out.println("Add files");
		 Main main = new Main();
		    main.mainMenu();
	}

}
