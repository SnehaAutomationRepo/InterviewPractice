package AppleInterviewPractice;

public class ReduceANumberToZero {

	public static void main(String[] args) {
		int num = 9;
		int count=0;
		
		while(num!=0) {
		if(num%2==0) {
			num = num/2;
			count++;	
		}
		else {
			num = num-1;
			count++;
		}
		}
		System.out.println("Number of steps needed to reduce the number to "+ num +" is : "+count);
	}

}
