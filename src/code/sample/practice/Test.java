package code.sample.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Adding comments to test 2nd commit

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adding another comment to check if working
		Test t = new Test();
		int[] num = {1,4,2,1,4,4,4};
		int res = t.maxSpan(num);
		System.out.println(res);
	}
	
	public int maxSpan(int[] nums) {
		  Map<Integer,ArrayList<Integer>> hMap = new HashMap<Integer,ArrayList<Integer>>();
		  ArrayList<Integer> arr = new ArrayList<Integer>();
		  
		  int max =0;
		  int count =0;
		  int diff=0;
		  
		  for(int i: nums){
		    if(hMap.containsKey(i)){
		      arr = hMap.get(i);
		      arr.add(count);
		      hMap.put(i,arr);
		    }else{
		    	ArrayList<Integer> temp = new ArrayList<Integer>();
		    	temp.add(count);
			    hMap.put(i,temp);
		    }
		    count++;
		  }
		  
		  for(Map.Entry<Integer,ArrayList<Integer>> m : hMap.entrySet()){
		    arr = m.getValue();
		    diff = arr.get(arr.size()-1) - arr.get(0) +1;
		    if(max < diff){
		      max = diff;
		    }
		  }
		  return max;
		}



}
