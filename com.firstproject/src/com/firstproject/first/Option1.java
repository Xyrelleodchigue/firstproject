package com.firstproject.first;

import java.io.File;

public class Option1 {
	
	public void fileList() {
		//System.out.println("list of files");
		File dirName = new File("C:/temp");
	    File[] listFiles = dirName.listFiles();
	    
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
