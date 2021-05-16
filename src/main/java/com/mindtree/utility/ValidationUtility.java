package com.mindtree.utility;

public class ValidationUtility {

	public static boolean isValidId(int id) {
		boolean isvalidid=false;
		if(id>0) {
			isvalidid=true;
		}
		return isvalidid;
	}

	public static boolean isValidName(String name) {
		boolean isvalidname=false;
		if(name!=null) {
			isvalidname=true;
		}
		return isvalidname;
	}

	public static boolean isValidQuantity(int quantity) {
		
		boolean isvalidquantity=false;
		if(quantity>0) {
			isvalidquantity=true;
		}
		return isvalidquantity;
	}

	public static boolean isValidPrice(double price) {
	boolean isvalidprice=false;
	if(price>0) {
		isvalidprice=true;
	}
		return isvalidprice;
	}

}
