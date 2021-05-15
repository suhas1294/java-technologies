package com.suhas;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassForName {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
		// Class.forName(""); // is used to load the driver
		// Pqr obj = new Pqr();
		// Without creating object, I want to load static block
		Class.forName("Pqr"); // executes static block
		Class.forName("Pqr").newInstance(); // executes both static and instance block

		
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		// instead of above code
		Class.forName("com.mysql.jdbc.Driver");
		
	}
}

class Pqr{
	// static block, called when class is called i.e., Pqr obj;
	static {
		System.out.println("In static");
	}
	// instance block, called when object is created, i.e., new Obj();
	{
		System.out.println("In instance");
	}
}