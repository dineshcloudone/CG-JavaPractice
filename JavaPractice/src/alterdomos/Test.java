package alterdomos;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

// two strings

/*
 * 
 *  String s1="miles"
 *  String s2="smile"
 *  
 *  if chars are same then pint it is anagram
 * 
 */

public class Test {

	public static void main(String[] args) {
		
//		String s1="miles";
//		String s2="smile";
		
		System.out.println("Enter String one :");
		Scanner sc1=new Scanner(System.in);
		String  s1=sc1.nextLine();
		
		System.out.println("Enter String two :");
		Scanner sc2=new Scanner(System.in);
		String  s2=sc2.nextLine();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		ArrayList<Character> al1=new ArrayList<Character>();
		ArrayList<Character> al2=new ArrayList<Character>();
		
		for(char c:ch1) {
			al1.add(c);
		}
		
		for(char c:ch2) {
			al2.add(c);
		}
		
		Collections.sort(al1);
		Collections.sort(al2);
		
//		al1.forEach(x->System.out.print(x));
//		System.out.println();
//		al2.forEach(x->System.out.print(x));
		
		boolean anagram=true;
		
		for(int i=0;i<al1.size();i++) {
			if(!al1.get(i).equals(al2.get(i))) {
				
				anagram=false;
			}
			
		}
		
		if (anagram) {
			System.out.println("It is anagram");
		}else {
			System.out.println("It is not anagram");
		}
		
		
	}
	
}
