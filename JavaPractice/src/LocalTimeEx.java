
import java.time.LocalTime;  

/*
 * The java.time, java.util, java.sql and java.text packages contains classes for representing date and time.
 *  Following classes are important for dealing with date in Java.
 * 
 */

public class LocalTimeEx {

	public static void main(String[] args) {  
	
		
		LocalTime time = LocalTime.now();  
	    System.out.println(time);
	    
	    String s=time.toString().replace(":", "").replace(".", "");
	    System.out.println(s);
	    System.out.println(s.substring(4));
	    
//	    System.out.println(System.getProperty("user.dir"));
	    
	}

}