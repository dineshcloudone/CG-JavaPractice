package interviewprograms;

public class PrimeNumbers {

	public static void main(String[] args){
        
	      int prime=100;
	      
	      for(int i=2;i<=prime;i++){
	          boolean yes=true;
	          for(int j=2;j<i;j++){
	              if(i%j==0){
	                  yes=false;
	              }
	          }
	          if(yes){
	              System.out.println("Prime : "+i);
	          }
	      }
	    }
}
