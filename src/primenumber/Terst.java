package primenumber;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.rmi.CORBA.Util;

public class Terst {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		String s1 = "ZIO  Score validation of   <brname> <brcode> not yet completed & pending  more  than <noofweeks>.";
		
		//String s1 = "ZIO  Score validation of   gfgdf 42154 not yet completed & pending  more  than 523.";
		
		
		//Before........
		
		
		String Str1 = null ;
//		String Str2 = Str1.replaceAll("<brname>", "Chennai West");
//		String Str3 =Str2.replaceAll("<date>",formatNormalDate(new Date()));
//		String Str4 =Str3.replaceAll("<audiorname>","saravana");
//		String Str5 =Str4.replaceAll("<commencementdate>","30/01/2016");
//		
//		Stringutils.replaceEach(String s1, String[] searchList, String[] replacementList);
//
//
//		System.out.println(Str5);
		
		
		HashMap<String, String> replacements = new HashMap<String, String>() {{
			put("<bankname>", "111");
		    put("<brcode>","2222");
		    put("<brname>", "333333333");
		    put("<date>","444444");
		    put("<fromdate>", "5555");
		    put("<todate>", "6666666");
		    put("<commencementdate>", "7777777777");
		    put("<reportdate>","888");
		    put("<auditorname>", "99999999999");
		    put("<noofweeks>","12121212");
		    put("<reportreleasedate>","191919");
		    }};
		    
		    
		    Set entrySet = replacements.entrySet();
		    
		    // Obtaining an iterator for the entry set
		    Iterator it = entrySet.iterator();
		 
		    // Iterate through HashMap entries(Key-Value pairs)
		    System.out.println("HashMap Key-Value Pairs : ");
		    
		    while(it.hasNext()){
		       Map.Entry me = (Map.Entry)it.next();
//		       System.out.println("Key is: "+me.getKey() + 
//		       " & " + 
//		       " value is: "+me.getValue());
		       
		       
		       Str1=s1.replaceAll(me.getKey().toString(), me.getValue().toString());
		       
		   }
		    
		    
		    
		   System.out.println("Str1........."+Str1); 
		    

		// create the pattern joining the keys with '|'
//		    String regexp = "<bankname>|<brcode>|<brname>|<date>|<fromdate>|<todate>|<commencementdate>|<reportdate>|<auditorname>|<noofweeks>|<reportreleasedate>";
//
//		StringBuffer sb = new StringBuffer();
//		Pattern p = Pattern.compile(regexp);
//		Matcher m = p.matcher(s1);

//		while (m.find()){
//		    m.appendReplacement(sb, replacements.get(m.group()));
//		
//
//		}m.appendTail(sb);
//		System.out.println(sb.toString());
		
		
		
	}
	
	public static String formatNormalDate(Date d) {
		if( d == null) return "";
		SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
		return formatter.format(d);
	}
}
