package interviewPrograms;

import java.util.*;
class loop{
	public static void main(String...a){
		looping();
		stringvov();
		array();
		array1();
		countWord();
	    setRemove();
	}
	static void looping(){
		for(int i=5;i>0;i--){
			for(int j=1;j<=5;j++)
			{
				
				if(i>=j)
				{
					System.out.print(j);
					
				}else{
					System.out.print("*");
				}
					
				
			}
			System.out.println();
		}
	}
	static void stringvov(){
		int count=0;
		String s="saravanakumar";
		s=s.toUpperCase();
		for(int i=0;i<=s.length()-1;i++){
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
				count++;
		}
		System.out.println("Number of vovels:"+count);
	}
	static void array(){
		int a[]={4,7,10,5,1,7,10};
		int max=0;
		for(int i=0;i<=a.length-1;i++){
				if(max<a[i]){
					max=a[i];
				}
		}
		int key=max,val=max;
		for(int i=0;i<=a.length-1;i++){
				if(key > a[i]){
						key=a[i];
				}
		}
		for(int i=0;i<=a.length-1;i++){
		  if(val > a[i] && a[i] != key){
					val=a[i];
							

				}
		}		
		System.out.println("2nd sumalest....."+val);
	}
	static void array1(){
		int a[]={1,8,10,5,9,10};
		int key=0,val=0;
		for(int i=0;i<=a.length-1;i++){
				if(key<a[i]){
					key=a[i];
				}
		}
		for(int i=0;i<=a.length-1;i++){
		  if(val < a[i] && a[i] != key){
					val=a[i];
							

				}
		}				
		System.out.println("2nd largest....."+val);
	}
	
	static void countWord(){
		int count=0;
		String s="saravana kumar P";
		s=s.toUpperCase();
		for(int i=0;i<=s.length()-1;i++){
			if(s.charAt(i)==' ')
				count++;
		}
		System.out.println("Number of Words:"+count);
	}
	static void setRemove(){
		TreeSet<String> ts=new TreeSet<String>() ;
		ts.add("a");
		ts.add("b");
		
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()){
			System.out.println("b4...."+itr.next());
			
		}
		ts.remove("a");
		
			
			Iterator<String> itr1=ts.iterator();
		  while(itr1.hasNext()){
			System.out.println("af...."+itr1.next());
			
		}
	
	}
}