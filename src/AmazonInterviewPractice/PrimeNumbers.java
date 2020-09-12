package AmazonInterviewPractice;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int[] arr = {2,4,5,6,8,7,9,34,11};
		for(int i=0; i<arr.length; i++) {
			
			isPrime(9);
		}
	
}
	
	
	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	        	   System.out.println(n+" is not a prime number");
	               return false; 
	               
	           }
	           
	       } 
	       System.out.println(n+" is a prime number");
	       return true;  
	   }  
}  


