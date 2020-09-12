package AppleInterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class printIntegerArraysInOrder {

	public static void main(String[] args) {
		int[] arr1 = {10,11,12};
		int[] arr2 = {12,11,10};
     List<Integer> list = new ArrayList<>();
     
     for(int i : arr1) {
    	 list.add(i);
     }
     
     for(int i : arr2) {
    	 list.add(i);
     }
     
     System.out.println(list);
     sortList(list);
	}
	
	public static void sortList(List<Integer> list) {
		
		List<Integer> targetList = new ArrayList<>();
		int largest = 0;
		
		while(!(list.isEmpty())) {
			largest = 0;
			for(int i =0; i<list.size(); i++) {
				if(list.get(i)>largest) {
					largest = list.get(i);
				}
			}
			
			targetList.add(largest);
			list.remove(new Integer(largest));
			
		}
		System.out.println(targetList);
		
	}

}
