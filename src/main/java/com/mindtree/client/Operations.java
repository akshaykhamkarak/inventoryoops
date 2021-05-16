package com.mindtree.client;

import com.mindtree.entity.Product;
import com.mindtree.exception.ServiceException;
import com.mindtree.utility.InputUtility;
import com.mindtree.services.*;
import com.mindtree.services.impl.ProductService;
public class Operations {
	
	static Service service;
	public Operations(){
		super();
		service=new ProductService();
	}
	
static InputUtility input =new InputUtility();
	public void displayMainMenu() {
		
		System.out.println("=====OPERATION IN INVENTORY MANAGEMENT SYSTEM=====");
		System.out.println("1.Add new product in Inventory.");
		System.out.println("2.update the quantity of product.");
		System.out.println("3.Disply product as per quantity.");
		System.out.println("4.Disply product as per sort base on quantity.");
		System.out.println("5.Delete product from inventory");
		System.out.println("6.Exit from the inventory");
	}

	public static void createInventory() {
		try {
		 int id=input.askId();;
		String name=input.askName();
		int quantity=input.askQuantity();
		 double price=input.askPrice();
		
		 if(service.createInventory(new Product(id,name,quantity,price))) {
			 System.out.println("Product add success...");
		 }
		}
		catch (ServiceException e) {
			System.out.println("Product creation fail..."+e.getMessage());
		}
		
	}

	
}
