package singletonclass;

import java.io.Serializable;

//Java program implementing Singleton class
//with using getInstance() method

//Class 1
//Helper class
class Singleton implements Serializable {
	
	// Static variable reference of single_instance
	// of type Singleton
	private static volatile Singleton single_instance = null;

	// Declaring a variable of type String
	public String s;

	// Constructor
	// Here we will be creating private constructor restricted to this class itself
	// It will handle the Reflection Attack also
	private Singleton() {
		if (single_instance != null) {
			throw new IllegalArgumentException("instance already created");
		} else {
			s = "Hello I am a string part of Singleton class";
		}
	}
	
	//Add readResolve  - which will be called during De-serialization process - this will return class instance
	public Singleton displayMesg() {
		return getInstance();
	}

	// Static method
	// Static method to create instance of Singleton class
	public static Singleton getInstance() {
		if (single_instance == null)
			synchronized(Singleton.class) {
				if(single_instance==null) {
					single_instance = new Singleton();
				}
			}
			

		return single_instance;
	}
}
