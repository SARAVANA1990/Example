package mapexamples;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
	
	public static void main(String args[]){
		MapItr mapItr=new MapItr();
		Map <Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "It's One");
		map.put(2, "It's Two");
		map.put(3, "It's Three");
		//mapItr.mapItrFor8(map);
		
		
		Map<String,List<String>> mapList=new HashMap<String,List<String>>();
		
		List<String> list1=new ArrayList<String>();
		list1.add("list11");
		list1.add("list12");
		list1.add("list13");
					
		List<String> list2=new ArrayList<String>();
		list2.add("list21");
		list2.add("list22");
		list2.add("list23");
		
		
		mapList.put("One",list1);
		mapList.put("two",list2);
		
		//mapItr.mapItrFor8(mapList,"two");
		
		
		Map<List<String>,List<String>> mapListofList=new HashMap<List<String>,List<String>>();
		
		List<String> keylist1=new ArrayList<String>();
						keylist1.add("K11");
						keylist1.add("K12");
		List<String> keylist2=new ArrayList<String>();
						keylist2.add("K21");
						keylist2.add("K22");
		List<String> valuelist1=new ArrayList<String>();
						valuelist1.add("valuelist11");
						valuelist1.add("valuelist12");
						valuelist1.add("valuelist13");
		List<String> valuelist2=new ArrayList<String>();
						valuelist2.add("valuelist21");
						valuelist2.add("valuelist22");
						valuelist2.add("valuelist23");
						
		/*List<String> valuelist3=new ArrayList<String>();
					valuelist3.add("valuelist31");
					valuelist3.add("valuelist32");
					valuelist3.add("valuelist33");
		List<String> valuelist4=new ArrayList<String>();
					valuelist4.add("valuelist41");
					valuelist4.add("valuelist42");
					valuelist4.add("valuelist43");*/
			mapListofList.put(keylist1, valuelist1);
			mapListofList.put(keylist2, valuelist2);
						
			mapItr.mapItrFor8(mapListofList,"K12","ListofList");
					
		
	}

}
