package com.mindtree.client;

import java.util.Scanner;

import com.mindtree.exception.InvalidOperationException;
import com.mindtree.utility.InputUtility;

/**
 * Hello world!
 *
 */
public class App {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Operations operation = new Operations();
	
		int choice=0;

		do {
			try {
				operation.displayMainMenu();
				System.out.println("Enter your choice");
				 choice = new InputUtility().askOption();

				switch (choice) {
				case 1:
					Operations.createInventory();
					
					break;
				case 6:
					System.out.println("Exit success..");
					break;
				default:
					
					System.out.println("Invalid...");
					break;

				}
				
			}

			catch (InvalidOperationException exception) {
				choice=6;
				System.out.println(exception.getMessage());
			
			}
		} while (choice!=6);
		
			
	}
}
