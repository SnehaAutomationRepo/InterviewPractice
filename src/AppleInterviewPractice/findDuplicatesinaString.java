package AppleInterviewPractice;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicatesinaString{



public static void main(String[] args){
 
String name = "SNEEEHAEA";

duplicatechar(name);

System.out.println("**************************************");

duplicatechar1(name);

}

public static void duplicatechar(String name){

Set<Character> dup = new HashSet<>();

for(int i=0; i<name.length(); i++){
if(!dup.add(name.charAt(i))){
System.out.println(name.charAt(i) + " is a duplicate");
}
}
}

public static void duplicatechar1(String name){

List<Character> list = new ArrayList<>();

for(int i=0; i<name.length(); i++){

for(int j=i+1; j<name.length(); j++){

     if(!list.contains(name.charAt(i))){
         if(name.charAt(i)== name.charAt(j)){
            list.add(name.charAt(i));
            System.out.println(name.charAt(i));
           }
      }
 }

}

}

}


