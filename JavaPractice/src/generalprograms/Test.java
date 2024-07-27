package generalprograms;

public class Test {
	
	public void factorial(int n) {
		
		int temp=1;
		for(int i=1;i<=n;i++) {
			temp=temp*i;
		}
		
		System.out.println("factorial value is :"+temp);
	}
	
	public void palindrome() {
		
		int n=838,r=0,p=0,temp=n;
		
		while(n>0) {
			r=n%10;
			p=p*10+r;
			n=n/10;
		}
		
		if(temp==p) {
			System.out.println("palindrome");
		}
		else {System.out.println("Not Palindrome");
		}		
	}
	
	public void fibonacciSeries(int n) {
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" "+n2);
		for(int i=0;i<n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(" "+n3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		t.fibonacciSeries(13);
		//t.palindrome();
		//t.factorial(5);

	}
	
/*
 * // Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class HelloWorld {
    
    static int i=0,j=1,k;
    
    static void fibonacci_recursive(int n){
        if(n>2){
            k=i+j;
            i=j;
            j=k;
            
            System.out.print(" "+k);
            fibonacci_recursive(n-1);
        }
    }
    
    static void fibonacci_series(int n){
        int a=0,b=1,count=0;
        if(n>0){
            System.out.print(a+" ");
            count++;
        }
        if(n>1){
            System.out.print(b+" ");
            count++;
        }
        // while(count<n){
        //     int next=a+b;
        //     System.out.print(next+" ");
        //     a=b;
        //     b=next;
        //     count++;
        // }
        
        for(int i=2;i<n;i++){
            int next=a+b;
            System.out.print(next+ " ");
            a=b;
            b=next;
        }
    }
   
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number to find fibonacci :");
        //System.out.print("Enter number to find factorial :");
        int n=scanner.nextInt();
        //fibonacci_series(n);
        fibonacci_recursive(n);
    }
    
     static int recursion_factorial(int n){
        if(n==1){
            return n;
        }else{
            return n*recursion_factorial(n-1);
        }
    }
    
    static void factorial(int n){
        
        int temp=1;
        for(int i=1;i<=n;i++){
            temp=temp*i;
        }
        System.out.println("Factorial value :"+temp);
    }
}
 */
	
}
