package AmazonOnlineAssessmentPractice;

import SortingAlgorithms.QuickSort;

public class ConcatNumbersOfAnArrayToGetLargest {

	public static void main(String[] args) {
	
		int num[] = {95,96,81,24,91,83};
		int lb = 0;
		int ub = num.length-1;
		
		int[] result = QuickSort.QuickSortAscending(num, lb, ub);
		
		for(int i=result.length-1; i>=0; i--) {
			System.out.print(result[i]);
		}
	}
	

}
