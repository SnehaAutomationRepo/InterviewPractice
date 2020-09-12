package AmazonInterviewPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NLargestElementsinanarray {
	
	public static void main(String[] args) {
		int arr[] = {3,6,5,4,8,7,1,3};
		
		List<Integer> arrlist = new ArrayList<>();
		for(int a : arr) {
			arrlist.add(a);
		}
		
		Map<Integer,Integer> sortedNumbers = largestElement(arrlist);
		System.out.println(sortedNumbers.get(8));
	}
	
	public static Map<Integer,Integer> largestElement(List<Integer> arrlist) {
		int largest = 0;
		int count = 0;
		//List<Integer> sortedList = new ArrayList<>();
		Map<Integer,Integer> sort = new HashMap<>();
		
		while(!arrlist.isEmpty()) {
		largest = 0;
		for(int i=0; i<arrlist.size(); i++) {
			if(arrlist.get(i)>=largest) {
				largest = arrlist.get(i);
			}
		}
			if(largest!=0) {
				arrlist.remove(new Integer(largest));
				count++;
				sort.put(count,largest);
			}
		}
	return sort;
	}

}

