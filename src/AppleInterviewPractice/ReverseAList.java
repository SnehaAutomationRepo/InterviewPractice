package AppleInterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class ReverseAList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(3);
		list.add(9);
		
		for(int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
		
	
}
}
