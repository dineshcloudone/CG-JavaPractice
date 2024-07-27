package generalprograms;

import java.util.Scanner;

public class FibonacciSeriesForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();
        
        int a = 0; // First Fibonacci number
        int b = 1; // Second Fibonacci number
        
        System.out.println("Fibonacci Series:");
        
        // Print the first two Fibonacci numbers
        System.out.print(a + " ");
        if (n > 1) {
            System.out.print(b + " ");
        }
        
        // Compute and print the rest of the Fibonacci numbers
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        
        scanner.close();
    }
}
