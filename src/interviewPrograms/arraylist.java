package interviewPrograms;

import java.util.ArrayList;
import java.util.Iterator;

class Arraylist
{
	public static void main(String a[])
	{
	ArrayList<String> val=new ArrayList<String>();
	val.add("abc");
	val.add("hai");
	val.add("good");
	Iterator itr=val.iterator();
	while(itr.hasNext())
	{  
		System.out.println(itr.next());  
	}  
	}
}