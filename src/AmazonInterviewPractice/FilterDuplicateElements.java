package AmazonInterviewPractice;

import java.util.HashSet;
import java.util.Set;

public class FilterDuplicateElements {

	//O(N)
	public static void main(String[] args) {
		int[] arr = {1,5,7,2,5,8,2};
		
		Set<Integer> arrlist = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			if(!arrlist.add(arr[i])) {continue;} 
		}
		System.out.println(arrlist);
		
	}
}
