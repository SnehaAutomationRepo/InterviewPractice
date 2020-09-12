package AppleInterviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumtoTarget {
	
    public static void main(String[] args){
        
        int nums[]= {2,5,8,6,4};
        int target = 10;
        
        twoSum(nums, target);
        
       
    }
    public static void twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length; i++) {
        int comp = target-nums[i];
        
        if(map.containsKey(comp)) {
        	System.out.println(map.get(comp) +" , "+i);
        }else {
        	map.put(nums[i], i);
        }
    }
    }


}
