package com.firstproject.first;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Option1 {
	
	public void fileList() throws IOException {
		  // Unsorted Array
				File dirName = new File("C:/temp");
				 File[] listFiles = dirName.listFiles();
		        File []array = dirName.listFiles();
		  
		        // Sorting the array
		        Arrays.sort(array);
		  
		        // Printing sorted array
		        System.out.println("Sorted Array:");
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i].getName()+ " \n");
		        }
		        System.out.println();
		  
	    	Main main = new Main();
	    	main.mainMenu();
		        
	    } 
}
	    
	    
	


