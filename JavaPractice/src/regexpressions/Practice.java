package regexpressions;

import java.util.regex.*;
import java.util.Scanner;

public class Practice {
	
	static void first_program() {
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean status1 = m.matches();
		System.out.println("status 1:"+status1);

		boolean status2 = Pattern.matches(".a", "ba");
		System.out.println("status 2:"+status2);
	}
	
	static void second_program() {
		
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "m"));
		System.out.println(Pattern.matches("[amn]", "ammmmn"));
		
	}
	
	static void quantifier_third_pgm() {
		System.out.println("? quantifier ....");  
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
		  
		System.out.println("+ quantifier ....");  
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
		  
		System.out.println("* quantifier ....");  
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
	}
	
	static void finder_pgm() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter regular expression pattern : ");// give java
		
		Pattern p=Pattern.compile(sc.nextLine());
		
		System.out.println("Enter text : ");// give this is java, you know java
		
		Matcher m=p.matcher(sc.nextLine());
		
		boolean found=false;
		
		while (m.find()) {    
			
            System.out.println("I found the text "+m.group()+" starting at index "+    
             m.start()+" and ending at index "+m.end());    
            found = true;    
        }    
        if(!found){    
            System.out.println("No match found.");    
        }
	}
	
	public static void main(String[] args) {

		//first_program();
		//second_program();
		finder_pgm();

	}

}
