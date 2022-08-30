package com.firstproject.first;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Option1 {
	
	public void fileList() throws IOException {
		//System.out.println("list of files");
		File dirName = new File("C:/temp");
	    File[] listFiles = dirName.listFiles();
	    Arrays.sort(listFiles);
	    
	    for (int i = 0; i < listFiles.length; i++) {
	    	 if (listFiles[i].isFile()) {
	    	        System.out.println("File: " + listFiles[i].getName());
	    	      } else if (listFiles[i].isDirectory()) {
	    	        System.out.println("Directory: " + listFiles[i].getName());
	    	      }
	    	
	    }
	    Main main = new Main();
	    main.mainMenu();
	    
	    }
	

}
