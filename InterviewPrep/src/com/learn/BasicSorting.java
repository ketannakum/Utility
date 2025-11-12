package com.learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicSorting {

   public static void main(String[] args)	{
	
	   getHeapSize();
	   sortStrings();
	   sortCharacters();
	   sortIntegers();
	   reverseSortIntegers();
	   getHeapSize();
	}
   
   public static void sortStrings()
   {
	   List<String> listStrings = Arrays.asList("Orange", "Grape", "Apple", "Lemon", "Banana");
		 
		System.out.println("Before string sorting: " + listStrings);
		 
		Collections.sort(listStrings);
		 
		System.out.println("After string sorting: " + listStrings);
   }
   
   public static void sortCharacters()
   {
	   List<Character> listCharacters = Arrays.asList('F', 'C', 'A', 'B', 'Z', 'E', 'K', 'P');
	   
	   System.out.println("Before characters sorting: " + listCharacters);
	    
	   Collections.sort(listCharacters);
	    
	   System.out.println("After characters sorting: " + listCharacters);
   }
   
   public static void sortIntegers()
   {
	   List<Integer> listIntegers = Arrays.asList(1, 6, 9, 3, 2, 0, 8, 4, 7, 5);
	   
	   System.out.println("Before integer sorting: " + listIntegers);
	    
	   Collections.sort(listIntegers);
	    
	   System.out.println("After integer sorting: " + listIntegers);

   }
   
   public static void reverseSortIntegers()
   {
	   List<Integer> listIntegers = Arrays.asList(1, 6, 9, 3, 2, 0, 8, 4, 7, 5);
	   
	   System.out.println("Before integer reverse sorting: " + listIntegers);
	    
	   Collections.sort(listIntegers);
	    
	   System.out.println("After integer sorting: " + listIntegers);
	    
	   Collections.reverse(listIntegers);
	    
	   System.out.println("After integer reversing: " + listIntegers);
   }
   
   public static void getHeapSize() {

		int mb = 1024*1024;

		//Getting the runtime reference from system
		Runtime runtime = Runtime.getRuntime();

		System.out.println("##### Heap utilization statistics [MB] #####");

		//Print used memory
		System.out.println("Used Memory:"
			+ (runtime.totalMemory() - runtime.freeMemory()) / mb);

		//Print free memory
		System.out.println("Free Memory:"
			+ runtime.freeMemory() / mb);

		//Print total available memory
		System.out.println("Total Memory:" + runtime.totalMemory() / mb);

		//Print Maximum available memory
		System.out.println("Max Memory:" + runtime.maxMemory() / mb);
	}
}

