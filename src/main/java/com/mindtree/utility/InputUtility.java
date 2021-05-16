package com.mindtree.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.mindtree.exception.InvalidEntryException;
import com.mindtree.exception.InvalidOperationException;

public class InputUtility {
	
	static Scanner sc = new Scanner(System.in);

	public int askOption() throws InvalidOperationException {
		int choice = 0;
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			throw new InvalidOperationException("Format is invalid..please restart application", e);
		}
		return choice;
	}

	public int askId() {
		int id = 0;
		boolean isvalidid = true;
		do {
			try {
				System.out.println("Enter the id:");
				id = sc.nextInt();
				if (!ValidationUtility.isValidId(id)) {
					throw new InvalidEntryException("invalid id is provided....");
				}
				isvalidid = false;
			}
			
			catch (InvalidEntryException e) {
				System.out.println(e.getMessage());

			}
			
			

		} while (isvalidid);

		return id;
	}

	public String askName() {
		String name="";
		boolean isvalidname=true;
		do {
			try {
				System.out.println("Enter the product name:");
				name=sc.next();
				if(!ValidationUtility.isValidName(name)) {
					throw new InvalidEntryException("Please provide proper name...");
					
				}
				isvalidname=false;
			}
			catch (InvalidEntryException e) {
				System.out.println(e.getMessage());
			}
		}while(isvalidname);
		return name;
	}

	public int askQuantity() {
		int quantity = 0;
		boolean isvalidid = true;
		do {
			try {
				System.out.println("Enter the Quantity:");
				quantity = sc.nextInt();
				if (!ValidationUtility.isValidQuantity(quantity)) {
					throw new InvalidEntryException("invalid quantity is provided....");
				}
				isvalidid = false;
			} catch (InvalidEntryException e) {
				System.out.println(e.getMessage());

			}

		} while (isvalidid);

		return quantity;
	
	}

	public double askPrice() {
	double price=0.0d;
	boolean isvalidprice=true;
	
	do {
		try {
			System.out.println("Enter the price:");
			price=sc.nextDouble();
			if(!ValidationUtility.isValidPrice(price)) {
				throw new InvalidEntryException("invalid price is provided....");
			}
				isvalidprice=false;
		}
		catch (InvalidEntryException e) {
			System.out.println(e.getMessage());
		}
	
	}while(isvalidprice);
		return price;
	}
}
