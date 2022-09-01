package com.firstproject.first;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String fileName;
		char chr;
		//char ch2;
		//File dirPath = new File("C:temp//");
		//String[]array = dirPath.list();
		
		System.out.println("LockersMe");
		System.out.println("Xyrelle Odchigue");
		
		do {
			System.out.println("Select option to perform: \n");
			System.out.println("1.Show List of File");
			System.out.println("2.Sub Options");
			System.out.println("3.Exit Program");
			//System.out.println("4.Search file");
			//System.out.println("5.Exit");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
				//list of files here
				fileList();
				
				break;
				
			case 2:
				//char chr2;
				//do {
				
				System.out.println("Select option to perform: \n");
				System.out.println("1. Create File");
				System.out.println("2. Delete File");
				System.out.println("3. Search File");
				System.out.println("4. Exit");
				
				int choice2 = sc.nextInt();
				
				switch(choice2) {
				
				case 1:
					System.out.print("Enter New Filename-->"); 
					String newFileName = sc.next();
					
					try {
						File newFile = new File("c://temp//"+newFileName+".txt");
						
						if (newFile.createNewFile()) {
				            System.out.println("File created successfully");
				        }
				        else {
				            System.out.println("Failed to create the file");
				        }
					}
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case 2:
					System.out.println("Enter file name to delete:");
					

					fileName = sc.next();

					File fileDelete = new File("C://temp//");
					String[]arr_delete = fileDelete.list();
							
					int deleteOption = 0;
					if (arr_delete == null) {
						System.out.println("There is no file preseent in the directory");
					} else {

						// Linear search in the array
						for (int i = 0; i < arr_delete.length; i++) {
							String delete_filename = arr_delete[i];
							if (delete_filename.equalsIgnoreCase(fileName)) {

								File dirPath2 = new File("C://temp//" + delete_filename);
								if (dirPath2.delete()) {
									System.out.println("File deleted successfully");
								} else {
									System.out.println("Failed to delete the file");
								}
								deleteOption = 1;
							}
						}
					}

					if (deleteOption == 0) {
						System.out.println("File Not Found");
					}
	;				
					break;
					
				case 3:
					System.out.println("Enter the file name for searching");

					fileName = sc.next();

					File directory_search = new File("C://temp//");

					String[] flist_search = directory_search.list();
					int searchOption = 0;
					if (flist_search == null) {
						System.out.println("There is no file preseent in the directory");
					} else {

						// Linear search in the array
						for (int i = 0; i < flist_search.length; i++) {
							String search_filename = flist_search[i];
							if (search_filename.equalsIgnoreCase(fileName)) {
								System.out.println(search_filename + " File found");
								searchOption = 1;
							}
						}
					}

					if (searchOption == 0) {
						System.out.println("File Not Found");
					}
					
					break;
					
				case 4:
					System.out.println("Thank you user.");
					break;
					
					default:
						System.out.println("Your input number is incorrect.Choose correct Number");
						break;
						
				}
				//break;
				
				
				
				
				break;
				
			
				
				//last loop for second switch
			//	break;
				
			case 3:
				System.out.println("Thank you user.");
				System.exit(0);
				break;
					
			default:

				System.out.println("Your input number is incorrect.Choose correct Number");
				break;
			}
			System.out.println("Do you want to continue Type (y or n) \n");
			chr = sc.next().charAt(0);
		}
	while (chr == 'Y' || chr == 'y');
		System.out.println("Thank you user.");
}

	
	private static void fileList(){
		File dirName = new File("C:/temp");
		// File[] listFiles = dirName.listFiles();
       File []array = dirName.listFiles();
 
       // Sorting the array
       Arrays.sort(array);
 
       // Printing sorted array
       //System.out.println("Sorted Array:");
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i].getName()+ " \n");
       }
       System.out.println();
	}
}


