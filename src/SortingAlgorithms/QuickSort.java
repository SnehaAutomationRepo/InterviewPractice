package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] A = {95,96,81,24,91,83};
		int lb = 0;
		int ub = A.length-1;
		
		int[] result = QuickSortAscending(A, lb, ub);	
		System.out.println(Arrays.toString(result));

	}
	
	public static int partition(int[] A, int lb, int ub) {
		
		int pivot = A[lb];
		int start = lb;
		int end = ub;
		
		while(start<end) {
		while(A[start]<=pivot) {
			start++;
		}
		
		while(A[end]>pivot) {
			end--;
		}
		
		if(start<end) {
			int[] swappedNumbers = swaptwoNumbers(A[start],A[end]);
			A[start] = swappedNumbers[0];
			A[end] = swappedNumbers[1];
		}
		}
		
		int[] swappedNumbers1 =swaptwoNumbers(A[lb],A[end]);	
		A[lb] = swappedNumbers1[0];
		A[end] = swappedNumbers1[1];
		
		return end;
	}

	
	public static int[] swaptwoNumbers(int a, int b) {
		
		int temp;
		int[] swappedNumbers  = new int[2];
		
		temp = a;
		a = b;
		b=temp;

		return new int[] {a, b};
	}

    public static int[] QuickSortAscending(int[] A, int lb, int ub) {
    	if(lb<ub) {
    	int loc = partition(A, lb, ub);   	
    	QuickSortAscending(A, lb, loc-1);
    	QuickSortAscending(A, loc+1, ub);
    	}
    	return A;
    }

}
