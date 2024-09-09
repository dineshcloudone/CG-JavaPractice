package fint_interview_programs;

import java.util.regex.*;

/*
 *  1 to 100, count no of zeros
 *  
 *  1 to 10 numbers with 10
 *  
 *  1. Convert the int -> String -> char array
 *  
 */

public class CountZerosUsingStrings {
	
	static int count=0;
	
	public static void count(int n) {
		
		Pattern p=Pattern.compile("[0]");
		Matcher m=p.matcher(String.valueOf(n));		
		while(m.find()) {
			count++;
		}
		
	}
	
	public static void main(String[] args) {
		
//		for(int i=1000;i<=1001;i++) {
//			count(i);
//		}
		
		//System.out.println("Total zeros count : "+count);
		
//		String s="1001001";
//		int count=s.split("0").length;
//		System.out.print("Total zeros count : "+(count-1));	
		
		int a=100;		
		Integer b=Integer.valueOf(a);
		
	}

}
