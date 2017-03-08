package collectionexamples;
 import java.util.*;
public class ArrayList {
	
	public static void main(String...args){
//  ArrayList<?> list= (ArrayList) new ArrayList<?>();
//	list.add(123);
//	list.add("dddddd");
//	Iterator<?> itr=list.iterator();
//	while(itr.hasNext()){
//		System.out.println(itr.next());
//	}		
//	System.out.println(fact(5));		
//	  ArrayList<String> list= (ArrayList) new ArrayList<String>();
//		list.add(123);
//		list.add("dddddd");
//		Iterator<?> itr=list.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(n -> System.out.println(n));
		
		List<Character> list1 = Arrays.asList('a','b');
		list1.forEach(n -> System.out.println(n));
			
	}
	
//	static int fact(int val){
//		int result=0;
//		if(val==1)return 1;
//		System.out.println("val...."+val);
//		result=fact(val-1) *  val;
//		System.out.println("result...."+result);
//	return result;	
//	}
	
	


}
