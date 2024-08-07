package exceptions;

public class MultiExceptionsInCatchBlock {

//	public static void main(String[] args) {
//
//		try {
//			int[] i = { 1, 2, 4 };
//			System.out.println(i[3]);
//		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//				e.printStackTrace();
//		}
//	}

	public static void main(String args[]){    
        try{    
            int array[] = new int[10];    
            array[11] = 30/0;    
        }    
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){  
            System.out.println(e.getMessage());  
        }    
     }    
	
	
}
