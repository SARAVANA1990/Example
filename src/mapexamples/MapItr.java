package mapexamples;

import java.util.List;
import java.util.Map;

public class MapItr {
	
	public void mapItrFor8(Map <Integer,String> map){
		map.forEach((k,v)->{
			System.out.println("key--->"+k);
			System.out.println("value--->"+v);
		}
		);
		
	}
	
	
	public void mapItrFor8(Map<String,List<String>> mapList,String a){
		
		/*System.out.println("Text----->"+a);
		
		mapList.forEach((k,v)->{
			
			System.out.println("key--->"+k);
			System.out.println("value--->"+v);
			v.forEach((s)->{
				System.out.println("inside for loop"+s);
			});
			
		});*/
		
	
     mapList.forEach((k,v)->{
    	 if(k.equals(a)){
			v.forEach((s)->{
				System.out.println("inside for loop"+s);
			});
    	 }
		});
		
    
	}
	
	
	public void mapItrFor8(Map<List<String>,List<String>> mapList,String a,String type){
		
		
		
		mapList.forEach((k,v)->{
			k.forEach((k1)->{
                 // System.out.println("key--->"+k1);
                  if(k1.equals(a)){
                	  System.out.println("key--->"+k1);
						 v.forEach((v1)->{
							 System.out.println("value--->"+v1);
						 });
               }
				
			});
		});
		
		
		
		

}
	
}