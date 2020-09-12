package AppleInterviewPractice;

public class TribonacciSeries {

	public static void main(String[] args) {
		int n = 6;
		
		int[] arr = new int[38];
		
		arr[0]=0;
		arr[1]=1;
		arr[2]=1;
		int i=0;
		
		while(i<n) {
			arr[i+3]=arr[i]+arr[i+1]+arr[i+2];
			i++;
		}
		
		System.out.println(i);
		System.out.println(arr[i]);
		
		fibonacciSeries(6);

	}
	
	//Fibonacci series
	
	public static void fibonacciSeries(int n) {
		int[] a = new int[38];
		
		a[0]=0;
		a[1]=1;
		int i=0;
		
		while(i<n) {
			a[i+2] = a[i]+a[i+1];
			i++;
		}
		
		System.out.println("value at "+n+" is : "+a[i]);
		
	}

}
