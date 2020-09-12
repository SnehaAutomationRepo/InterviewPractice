package AppleInterviewPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arraysinserttest {
	
	public static void main(String[] args) {
	int[] data = {0,1,2,3,4};
	int[] index = {1,1,2,2,1};
	int[] target = new int[data.length];
	
/*	List<Integer> list = new LinkedList<>();
	
	list.add(1);
	list.add(2);
	System.out.println(list);
	list.set(1, 3);
	System.out.println(list);
	list.add(1, 4);
	System.out.println(list);
	
List<Integer> list1 = new ArrayList<>();
	
	list1.add(1);
	list1.add(2);
	System.out.println(list1);
	list1.set(1, 3);
	System.out.println(list1);
	list1.add(1, 4);
	System.out.println(list1);*/
	
	for(int i=0; i<index.length; i++) {
		if(target[index[i]]==0) {
			target[index[i]]= data[i];
		}
		
		else {
			for(int j=i; j>=index[i];j--) {
			target[j] = target[j-1];
		}
			target[index[i]]=data[i];
			
		}	
	}
	for(int i=0; i<target.length; i++) {
		System.out.print(target[i]+" ");	
	}
	
	
	}
	
}
