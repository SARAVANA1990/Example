package collection;

import java.util.*;
import collection.Key2D;

public class Sample1HashMap {
	
	
	public static void main(String []args){

	Map<Key2D, String> map = new HashMap<Key2D, String>();
	map.put(new Key2D("21", "101"), "21,22,23");
	map.put(new Key2D("22", "102"), "21,22,23,25,26");
	map.put(new Key2D("23", "103"), "21,22,23,24,52");
	map.put(new Key2D("24", "104"), "21,22,23,85,55");
	map.put(new Key2D("25", "105"), "21,22,23,11,14");
	
	
	for(int i=1;i<=5;i++)
	System.out.println("value.................."+map.get(new Key2D("2"+i, "10"+i)));
	
	}


}


