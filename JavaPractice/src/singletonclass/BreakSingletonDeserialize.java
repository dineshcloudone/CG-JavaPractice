package singletonclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakSingletonDeserialize {

	public static void main(String[] args) {
		try {
			
			Singleton instance1=Singleton.getInstance();
			
			//Serialize the browser instance
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("browser.txt"));
			out.writeObject(instance1);
			out.close();
			
			//De-Serialize the browser instance
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("browser.txt"));
			Singleton instance2=(Singleton)in.readObject();
			in.close();
			
			System.out.println("Instance1 hash code: "+instance1.hashCode());
			System.out.println("Instance2 hash code: "+instance2.hashCode());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
