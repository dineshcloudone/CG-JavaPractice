package factorymethod;

// Entire Factory Method Explanation : https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/

// Refactoring.guru website : https://refactoring.guru/design-patterns/java

/*
 * It is a creational design pattern that talks about the creation of an object. 
 * The factory design pattern says to define an interface ( A java interface or an abstract class) 
 * for creating the object and let the subclasses decide which class to instantiate.
 */

public interface Notification {
	
	void notifyUser();
}
