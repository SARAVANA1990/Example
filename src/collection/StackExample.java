package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class StackExample {
	public static void main(String args[]){
		Stack<String> s= new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.add("d");
		
	   ListIterator<String> q=s.listIterator(); 
	   while(q.hasNext())
	   System.out.println("---->"+s.pop());
	  // System.out.println("---->"+q.next());
			
       Vector<String> vec = new Vector<String>();
       vec.add("A");
       vec.add("B");
       vec.add("C");
       
       Iterator<String> itr=vec.iterator();
       while(itr.hasNext())
    	   System.out.println("---->"+itr.next());
		
	}

}
