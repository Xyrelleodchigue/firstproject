package com.firstproject.first;

import java.io.IOException;
import java.util.Scanner;

public class Option2 {
	
	public void subOoptions() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter 2a for adding files, 2b for deleting files, 2c for searching a file, 2d for going back to main menu, 3 to exit program: ");
		String options = sc.nextLine();
		
		
		if (options.equals("2a")) {
			Option2_add op2a = new Option2_add();
			op2a.add_files();
		}
		else if (options.equals("2b")){
			Option2_delete op2b = new Option2_delete();
			op2b.deleteFile();
		}
		else if (options.equals("2c")){
			Option2_search op2c = new Option2_search();
			op2c.searchFile();
		}
		else if (options.equals("2d")){
			Main main = new Main();
			main.firstDetails();
		    main.mainMenu();
		  }
		else if (options.equals("3")){
			Option3 op3 = new Option3();
			op3.exit();
		}
		else {
			System.out.println("Invalid selection.");
			Option2 subop = new Option2();
			subop.subOoptions();
		
			
		}
		
		
		
		
		
		//System.out.println("select suboptions");
		}
}
