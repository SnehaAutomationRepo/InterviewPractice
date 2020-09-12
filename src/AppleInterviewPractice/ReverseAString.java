package AppleInterviewPractice;

public class ReverseAString {

	public static void main(String[] args) {

 String s = "SNEHA IS A CODER";
 String rev ="";
 
 String[] s1 = s.split(" ");
 
 
   for(int i=0 ; i<s1.length; i++) {
	   rev="";
	   for(int j=s1[i].length()-1; j>=0 ; j--) {
		   rev = rev+s1[i].charAt(j);
	   }
	   System.out.print(rev + " ");
   }

	}

}
