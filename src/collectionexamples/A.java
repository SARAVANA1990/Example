package collectionexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class A {
	
	public static void main(String...args){
	
			
			
		  ArrayList<String> list=new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("1");


			Set<String> set = new HashSet<String>();
			set.addAll(list);
			list.clear();
			list.addAll(set);
			
			
			Iterator<?> itr=list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			
			
		}
		



}
