package com.firstproject.first;

import java.util.Scanner;


public class Main {
	
		
	
	
		public void firstDetails() {
			String appName = "LockersMe";
			String developerName = "Xyrelle Odchigue";
			
			System.out.println("Application Name: " + appName);
			System.out.println("Developers Name: " + developerName);
		}
		
		public void mainMenu() {
			Scanner sc = new Scanner(System.in);	
			
			//do {
			System.out.println("Please enter 1 for list of files, 2 for suboptions, 3 for closing the program: ");
			String options = sc.nextLine();
			
			if (options.equals("1")) {
				Option1 option1 = new Option1();
				option1.fileList();
			}
			else if(options.equals("2")) {
				Option2 option2 = new Option2();
				option2.subOoptions();
			}
			else if (options.equals("3")) {
				Option3 option3 = new Option3();
				option3.exit();
			}
			else {
				System.out.println("Error selection");
				Main main = new Main();
				main.mainMenu();
			}
			
			//while(!options.equals("1"));
			}
		
		
		public static void main (String[]args) {
			Main main = new Main();
			main.firstDetails();
			main.mainMenu();
		}
		
	

		
		}


