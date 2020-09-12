package AshwinPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	
	public static void main(String[] args) {
		play();
		
	}
	
	public static void play() {
		
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		Map<String, String> map = new HashMap<>();
		Iterator<String> iterator = set.iterator();
		
		
		list.add("sneha");
		set.add("sneha");
		map.put("sneha", "value");
		
		List<String> list1 = new ArrayList<>(set);
		System.out.println(list1.get(0));
		System.out.println(list.get(0));
		System.out.println(map.get("sneha"));
	}

}
