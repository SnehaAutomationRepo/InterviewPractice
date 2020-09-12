package AppleInterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class LuckyInteger {

	public static void main(String[] args) {
		int[] arr = {2,4,4,4,4,6,3,3,3,6};
		int count = 1;
		int output = 0;
		List<Integer> coveredlist = new ArrayList<>();
		
		if(arr.length == 0) {
			System.out.println("There are no values in the array");
		}
		else {
		for(int i=0; i<=arr.length-1; i++) {
			count=1;
			if(!coveredlist.contains(arr[i])) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[i]==arr[j]) {
					count++;
					//System.out.println(count);
				}
			}
			coveredlist.add(arr[i]);
			
			if(arr[i]==count && arr[i]>output) {
				output = arr[i];
			}
			}
		}
		}
		if(output!=0) {
		System.out.println(output+" is the lucky number");
		}
		else {
			System.out.println("There is no lucky number in the array");
		}
	}

}
