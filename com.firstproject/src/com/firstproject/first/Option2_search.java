package com.firstproject.first;

import java.io.File;
import java.util.Scanner;

public class Option2_search {
	
	public void searchFile() {
		//System.out.println("Search File");
		File dirName = new File("C:/temp");
		File[]arr = dirName.listFiles();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter file to be search:");
			String x = sc.nextLine();
			boolean isFound = linearSearch(arr, x);
			if (isFound) {
				System.out.println("Found file in array");
			}else {
				System.out.println("File not found");
			}
		}
		}
		
		static boolean linearSearch(File[]arr, String x) {
			for(int i = 0; i<arr.length; i++) {
				if (arr[i].toString().equals(x)) {
					System.out.println(arr[i].toString());
					return true;
				}
			}
			return false;
		}
	}


