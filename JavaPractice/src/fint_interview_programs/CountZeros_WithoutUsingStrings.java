package fint_interview_programs;

public class CountZeros_WithoutUsingStrings {	

	    public static void main(String[] args) {
	        int zeroCount = countZeros(1, 100);
	        System.out.println("Number of zeros from 1 to 100: " + zeroCount);
	    }

	    public static int countZeros(int start, int end) {
	        int count = 0;

	        for (int i = start; i <= end; i++) {
	            count += countZerosInNumber(i);
	        }
	        
	        System.out.println(2%10);

	        return count;
	    }

	    public static int countZerosInNumber(int number) {
	        int count = 0;
	        
	        // Count zeros in units place
	        if (number % 10 == 0 && number != 0) {
	            count++;
	        }
	        
	        // Count zeros in tens place
	        if (number / 10 % 10 == 0 && number >= 10) {
	            count++;
	        }

	        return count;
	    }
}
