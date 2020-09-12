package AppleInterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class LargestintheList{

public static void main(String[] args){

List<Integer> list = new ArrayList<>();

list.add(3);

list.add(4);

list.add(8);

list.add(34);

list.add(23);

list.add(67);

list.add(28);

System.out.println(list);

System.out.println("The largest in the list is : "+ SortanArray(list));

}

public static int SortanArray(List<Integer> list){

int largest = 0;

for(int i=0; i<list.size(); i++){

if(list.get(i)>largest){
largest = list.get(i);
}

}

return largest;

}
}
