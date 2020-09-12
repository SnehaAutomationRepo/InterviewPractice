package AppleInterviewPractice;

public class RemovePalindromeSubSequence {

	public static void main (String[] args)  
	{ 

    String s="ababbab";
    
    int l =0;
    int h = s.length()-1;
    
    while(h>l) {	
    		if(s.charAt(l)!=s.charAt(h)) {
    			break;
    		}
    		else {
    			l++;
    			h--;
    		}
    }
    if(h>l) {
    	System.out.println("Number of steps needed is : "+2);
    }
    if(h==l) {
    	System.out.println("The number is already a palindrome : "+ 1);
    }
 
	} 
}
