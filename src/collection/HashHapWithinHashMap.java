package collection;

import java.util.*;
public class HashHapWithinHashMap {
	public static void main(String []args){
	
   Map<String,HashMap<String,String>> outerMap = new HashMap<String,HashMap<String,String>>();
   Map<String,String> innerMap = new  HashMap<String,String>();	
   
	 List<String> rejto=new ArrayList<String>();
	 rejto.add("21");  
	 rejto.add("22"); 
	 rejto.add("23"); 
 
	 List<String> accounts=new ArrayList<String>();
	 accounts.add("101-Saravana");  
	 accounts.add("102-kumar"); 
	 accounts.add("103-P"); 
 
	 List<String> adpoint=new ArrayList<String>(); 
	 adpoint.add("101,102,"); 
	 adpoint.add("201,202,203"); 
	 adpoint.add("301,302,203"); 

	 
	 for(String a:accounts){
		 for(String p:adpoint){
		 innerMap.put(a,p);		 
		 }
	 }
	 
	 for(String s:rejto){
		 outerMap.put(s,(HashMap<String, String>) innerMap);		 
		 }
	 
	 
	 for(String r:rejto){
		 for(String a:accounts){
		 String AuditPoint = ((HashMap<String, String>)outerMap.get(r)).get(a).toString();
		 
		 System.out.println("reject to....."+r);
		 System.out.println("accounts....."+a);
		 System.out.println("AuditPoint....."+AuditPoint);
		 
		 }
		
	 }

	}
}
