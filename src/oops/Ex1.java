package oops;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Ex1 {
	
	public static void main(String...args) {
		//getting a uncommon element in a array 
		
		/*Integer a[]={1,2,3,4,5};
		Integer b[]={3,4,5,6,7,8,9};
		
		Set<Integer> set1 =new HashSet<Integer>(Arrays.asList(a));
		Set<Integer> set2 =new HashSet<Integer>(Arrays.asList(b));
		
		Set<Integer> result =new HashSet<Integer>(set1);
		Set<Integer> temp =new HashSet<Integer>(set2);
		
	  
		result.removeAll(set2);
		temp.removeAll(set1);
		result.addAll(temp);
		
		Iterator<Integer> itr=result.iterator();
		while(itr.hasNext()){
		    System.out.println("2-"+itr.next());//exe result 126789
		}*/
		
		
	/*	Integer a[]={1,2,3,4,5};
		Integer b[]={3,4,5,6,7,8,9};
		
		Set<Integer> set1 =new HashSet<Integer>(Arrays.asList(a));
		Set<Integer> set2 =new HashSet<Integer>(Arrays.asList(b));
		Set<Integer> temp =new HashSet<Integer>(set1);
	
		set1.removeAll(set2);
		System.out.println(set1);
		temp.retainAll(set2);
		System.out.println(temp);
		set2.removeAll(temp);
		System.out.println(set2);
		set1.addAll(set2);
		System.out.println(set1);

		*/
		
		/*Integer a[]={1,2,3,4,5};
		Integer b[]={3,4,5,6,7,8,9};
		
		Set<Integer> set1 =new HashSet<Integer>(Arrays.asList(a));
		Set<Integer> set2 =new HashSet<Integer>(Arrays.asList(b));
		
		set1.addAll(set2);
		System.out.println(set1.toArray()[6]);*/
		
		String a="this is my pen";
		String[] w=a.split(" ");
		System.out.println(w[0]);
		
		String s = "I want to walk my dog";

		 String[] arr = s.split(" ");    

		 for ( String ss : arr) {

		       System.out.println(ss);
		  }
		
	}

}
