package singletonclass;

//Singleton Design Pattern Practices
//https://www.geeksforgeeks.org/private-constructors-and-singleton-classes-in-java/?ref=lbp

import java.io.*;

public class MySingleton_Ex {

	public static void main(String args[])	
	{
		MySingleton a = MySingleton.getInstance();
		MySingleton b = MySingleton.getInstance();
		a.x = a.x + 10;
		System.out.println("Value of a.x = " + a.x);
		System.out.println("Value of b.x = " + b.x);
	}
}


//Java program to demonstrate implementation of Singleton
//pattern using private constructors.


class MySingleton
{
	// 1. private static instance of the class 
	private static MySingleton instance = null;
	
	public int x = 10;
	
	//2.  private constructor can't be accessed outside the class
	private MySingleton() { }

	//3. Factory method to provide the users with instance
	public static MySingleton getInstance()
	{
		if (instance == null)		
			instance = new MySingleton();

		return instance;
	}
}

