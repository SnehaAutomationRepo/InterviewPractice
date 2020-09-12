package AppleInterviewPractice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = -153;	
		num=Math.abs(num);
		//System.out.println(num);
		
		int altnum = num;
		//int length = 0;
		int rem = 0;
		int res =1;
		int output = 0;
		
		
		int length = Integer.toString(num).length();
		//System.out.println(length1);
				
				
		if(num==0) {
			System.out.println("Please enter a number in two digits");
		}
		
		while(num!=0) {
			res=1;
			rem = num%10;
			num=num/10;
			for(int i=0; i<length; i++) {	
				res = res*rem;
			}
			output = output+res;
		}
		
		System.out.println("output is : "+ output);

	}

}
