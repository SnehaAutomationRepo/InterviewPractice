package AppleInterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAString {
	
	public static void main(String[] args) {
		String data = "CBA CAB";
		
		List<Character> input = new ArrayList<>();
		
		for(int i=0; i<data.length(); i++) {
			
			input.add(data.charAt(i));
		}
		
		Character[] output = sortingAnArray(input);
		
		for(int i=data.length()-1; i>=0; i--) {
			System.out.print(output[i]);
		}
		
		System.out.println();
	}
	
	public static Character[] sortingAnArray(List<Character> input) {
		Character[] sortedlist = new Character[input.size()];
		char largest = 0;
		int count =0 ;
		
		while(!(input.isEmpty())) {	
			largest = 0;
		for(int i=0; i<input.size(); i++) {
			if(input.get(i).compareTo(largest)>0) {
				largest = input.get(i);
			}
		}
		if(!(largest==0)) {
			sortedlist[count]=largest;
			count++;
			input.remove(new Character(largest));
		}
		}
		//System.out.println("sortedlist is : "+ Arrays.toString(sortedlist));
		return sortedlist;
	}
	

}
