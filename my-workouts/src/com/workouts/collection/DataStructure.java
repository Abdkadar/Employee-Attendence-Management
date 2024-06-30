package com.workouts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DataStructure {
	public static void main(String[] args) {

		/*
		 * int arr[]= {3,3,5,4}; List<Integer> list=Arrays.asList(3,3,4);
		 * 
		 * list.forEach(n->{
		 * 
		 * });
		 */
		int nums[]= {1,1,0,1,1,1};
		int maxCount = 0;
        int currentCount = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
        }
        
        if (currentCount > maxCount) {
            maxCount = currentCount;
        }
        System.err.println(maxCount);
		
		
		
	 // remove duplicate elements in the list  --start	
//	   List<String> list=Arrays.asList("hi","hi","love","you");
//       Set<String> set=new HashSet<String>(list);
//       System.out.println(set.toString());
//	   list.stream().distinct().collect(Collectors.toList());
//	   //--end
//	   
//	   // reverse string 
//	   String s="helloworld";
//	   
//	   char[] c=s.toCharArray();
//	   int l=c.length;
//	   
//	   for(int i=l-1;i>=0;i--) {
//		   System.out.println(c[i]);
//	   }
//	   
//	   
//	   List<Integer> list = new ArrayList<>();
//	   int arr[]= {3,5,10,2,3};
////	   List<Integer> sorted=numbers.stream().sorted().collect(Collectors.toList());
//		int n=arr.length;
//		
//		
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){ 
//                if(arr[j]==arr[i]){
//                    list.add(arr[i]);
//                }
//            }
//        }
//        
        
	   
          	   
		
//		List<Integer> numbers = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
//        int pairs =0;
//
//        for (int i = 0; i < numbers.size(); i++) { 
//            for (int j = i + 1; j < numbers.size(); j++) {
//                if (numbers.get(i) == numbers.get(j) ) {
//                    pairs++;
//                }
//            }
//        }
//        System.out.println(pairs);
        
//        List<Integer> numbers = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//        
//        // Count the occurrences of each element
//        for (int number : numbers) {
//            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
//        }
//        
//        int pairs = 0;
//        
//        // Calculate the number of pairs for each element
//        for (int count : frequencyMap.values()) {
//            pairs += count / 2;
//        }
//        
//        System.out.println(pairs); 
       
         
         
//         for (int i = str.length()-1; i >=0; i--) {
//			System.out.println(str.charAt(i));
//		}
		
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

	}

}
