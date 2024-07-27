package generalprograms;

import java.util.Scanner;

public class FibonacciSeriesWithWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();
        
        int a = 0; // First Fibonacci number
        int b = 1; // Second Fibonacci number
        int count = 0; // Counter to track the number of Fibonacci numbers printed
        
        System.out.println("Fibonacci Series:");
        
        // Print the first Fibonacci number
        if (n > 0) {
            System.out.print(a + " ");
            count++;
        }
        
        // Print the second Fibonacci number
        if (n > 1) {
            System.out.print(b + " ");
            count++;
        }
        
        // Compute and print the rest of the Fibonacci numbers using a while loop
        while (count < n - 1) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
            count++;
        }
        
        scanner.close();
    }
}
