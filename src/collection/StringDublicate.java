package collection;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDublicate {
public static void main(String[] args) {
	
	//CharCount(); 
	//arrayListtoArray();
	//patternMacherExacmble();
	//permutation("","ABC");
	//arrayListInMap();
	//hashSetInMap();
	
	
	/* ******************
	 * Map Examples
	 * 
	 */
	    
	// mapExample();
	 
	 
	    /* ******************
		 * Comparable Comparator  Examples
		 * 
		 */
			//comparableExample();
	
			//comparatorExample();
	
	        //nullPointerExample();
	
	
	       //  convertingArrayToVarious();
	
	char str="ABC".charAt(0);
	String str1="ABC".substring(1,1);
	
	System.out.println("str..."+str+"...str1..."+str1);
	
	/*int x=fact(3);
		  
	
	System.out.println("X....."+x);*/

    }


private static void permutation(String perm, String word) { 
	if (word.isEmpty()) {
		System.err.println(perm + word);
	} else {

		for (int i = 0; i < word.length(); i++) {
			
			permutation( perm + word.charAt(i) , word.substring(0, i)+ word.substring(i + 1, word.length()));
			// i
			// 0.1 :  " " + A , " " + BC   --> A , BC 
			// 0.2 :  A + B  , " " + C --> AB , C
			// 0.3 :  AB + C , " " + " " -- > ABC , " "
			      // Print value ==> ABC
			
			
			
		}
	}
}

private static int fact(int i) {
	   
	 if(i==1)
	 {
		 return i;
	 }else{
		 return i*fact(i-1);
	 }
		
			}



static void CharCount(){

		String a="abcdabc";
		Map<Character, Integer> m=new HashMap<Character,Integer>();
		
		char[] c= a.toCharArray();
		
		for(char b:c){
			//System.out.println(b);
			
			if(m.containsKey(b)){
				
				m.put(b, m.get(b) + 1);
				
			}else{
				 m.put(b,1);
			}
			
		}
		String s=null;
		//System.out.println("m...."+m);
		for(Map.Entry hm:m.entrySet()){  
			//int i= hm.getValue();
			if(((int)hm.getValue()) > 1){
			   //System.out.println(hm.getKey()+" "+hm.getValue());  
				System.out.print(hm.getKey().toString());
				
			  }  
		}
		
		//System.out.println("s............"+s);  

}

static void arrayListtoArray(){
	   Integer a[]={1,2,3};
	   Integer b[]={1,2,3,4};
       List<Integer> l1=Arrays.asList(a);
       List<Integer> l2=Arrays.asList(b);
         
       ArrayList<Integer> al1=new ArrayList<Integer>(l1);
       ArrayList<Integer> al2=new ArrayList<Integer>(l2);
       
       al1.addAll(al2);
       
       Integer[] LA=al1.toArray(new Integer[al1.size()]);
       
       for(Integer cc:LA)
       {
    	   System.out.println("LA......."+cc);
       }
       
      
       
       Set<Integer> hs= new HashSet<Integer>(al1);
       
       System.out.println("hs........."+hs);
       
       Integer[] c=hs.toArray(new Integer[hs.size()]);
       
       
       for(Integer cc:c)
       {
    	   System.out.println("cc......."+cc);
       }
       
}

static void patternMacherExacmble(){
	
	
	
	
/*	String replace="saravana kumar";
	
	    Map replacements=new HashMap<String , String>();
		// create the pattern joining the keys with '|'
		System.out.println("replace....."+replace);
		String regexp = " ";
		StringBuffer sb = new StringBuffer();
		Pattern p = Pattern.compile(regexp);
		Matcher m = p.matcher(replace.trim());
		
	  System.out.println("m............................"+m.toString());
	  System.out.println("p..........................."+p.toString());
	  System.out.println("replacements................"+replacements.toString());
	 System.out.println("group......................."+m.group().toString());

		
		while (m.find()){
			 //String text = m.group(1);
			 //System.out.println("group......................."+m.group().toString());
			m.appendReplacement(sb, (String) replacements.get(m.group()));
		}
		m.appendTail(sb);
		System.out.println("After........" + sb.toString());*/
	
	
	String find="\\s";
	String input="saravana kumar";
	String repalce="%20";
	 
	Pattern p=Pattern.compile(find);
    Matcher m=p.matcher(input);
    
   String result= m.replaceAll(repalce);
    //int count=0;
    System.out.println("result......."+result);
    
		
		
	
}



	
	
	
	
	
	
	private static void arrayListInMap() { 
		
		
		List<String> al0=new ArrayList<String>();
	    al0.add("Ac1");
	    al0.add("Ac2");
	    al0.add("Ac3");
	    al0.add("Ac4");
		
		List<String> al1=new ArrayList<String>();
		al1.add("Y");
		al1.add("Y");
		
		List<String> al2=new ArrayList<String>();
		al2.add("N");
		al2.add("N");
		
		List<String> al3=new ArrayList<String>();
		
		
		Map<String,List<String>> hm= new HashMap<String,List<String>>();
		hm.put("A.P", al0);
		hm.put("1", al1);
		hm.put("2", al2);
		//al1.addAll(al2);
		al3.addAll(al1);
		al3.addAll(al2);
		
		hm.put("3", al3);
		
		
		
		List<String> al_0=new ArrayList<String>();
		al_0.add("Ac1");
		al_0.add("Ac2");
		al_0.add("Ac3");
		al_0.add("Ac4");
		
		List<String> al_1=new ArrayList<String>();
		al_1.add("Y");
		al_1.add("Y");
		
		List<String> al_2=new ArrayList<String>();
		al_2.add("N");
		al_2.add("N");
		
		List<String> al_3=new ArrayList<String>();
		
		Map<String,List<String>> lhm= new LinkedHashMap<String,List<String>>();
		
		lhm.put("A.P", al_0);
		lhm.put("1", al_1);
		lhm.put("2", al_2);
		al_3.addAll(al_1);
		al_3.addAll(al_2);
		lhm.put("3",al_3);
		
	
		
		for (Map.Entry<String, List<String>> entry : hm.entrySet()) {
		    String key = entry.getKey();
		    System.out.print(key+"    | " );
		  //  List<String> value = entry.getValue();
		    for(String aString : entry.getValue()){
		        System.out.print(aString+",");
		    }
		    
		    System.out.println();
		}
		
		System.out.println("_____________________________________________________________________");
		for (Map.Entry<String, List<String>> entry : lhm.entrySet()) {
		    String key = entry.getKey();
		    System.out.print(key+" | " );
		  //  List<String> value = entry.getValue();
		    for(String aString : entry.getValue()){
		        System.out.print(aString+",");
		    }
		    
		    System.out.println();
		}
		System.out.println("_____________________________________________________________________");
		
		
		/*for (Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
	        System.out.print(entry.getKey()+" | ");
	        for(int fruitNo : entry.getValue()){
	            System.out.print(fruitNo+" ");
	        }
	        System.out.println();
	    }
		*/
		
	}
	
	
private static void hashSetInMap() {
	
	    Set<String> al0=new HashSet<String>();
	    al0.add("Ac1");
	    al0.add("Ac2");
		
		Set<String> al1=new HashSet<String>();
		al1.add("Y");
		al1.add("Y");
		
		Set<String> al2=new HashSet<String>();
		al2.add("N");
		al2.add("N");
		
		//boolean al3=new ArrayList<String>();
		
		
		Map<String,Set<String>> hm= new HashMap<String,Set<String>>();
		hm.put("A.P", al0);
		hm.put("1", al1);
		hm.put("2", al2);
		al1.addAll(al2);
		hm.put("3", al1);
		
//		System.out.println("Aud Point | Accounts");
		
		for (Map.Entry<String, Set<String>> entry : hm.entrySet()) {
		    String key = entry.getKey();
		    System.out.print(key+"          | " );
		  //  List<String> value = entry.getValue();
		    for(String aString : entry.getValue()){
		        System.out.print(aString+",");
		    }
		    
		    System.out.println();
		}
		
		
		
		/*for (Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
	        System.out.print(entry.getKey()+" | ");
	        for(int fruitNo : entry.getValue()){
	            System.out.print(fruitNo+" ");
	        }
	        System.out.println();
	    }
		*/
		
	}


 static void mapExample(){
	 
	 Map<Integer,String> hm=new HashMap<Integer,String>();
	 
	 hm.put(1, "one");
	 hm.put(2, "two");
	 hm.put(3, "three");
	 hm.put(4, "four");
	 
	 for(Map.Entry<Integer, String> e : hm.entrySet()){
		 System.out.println("key....."+e.getKey());
		 
		 System.out.println("value....."+e.getValue());
		 
	 }
	 
	 
	 
	 
 }

 
	static void comparableExample() {

		Student s1 = null;
		Student s2 = null;

		s1 = addval1("SARAVANAKUMAR", 99, 92, 95);
		s2 = addval1("KUMAR", 85, 82, 88);

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(s1);
		studentList.add(s2);
		
		
		itrVal(studentList);
		forEachVal(studentList);
		
		Collections.sort(studentList);
		
		//Collections.sort(studentList, new sortStudent());
		
		System.out.println("After short");
		itrVal(studentList);
		forEachVal(studentList);

	}
	
	
	static void comparatorExample() {

		Student s1 = null;
		Student s2 = null;

		s1 = addval1("SARAVANAKUMAR", 99, 92, 95);
		s2 = addval1("KUMAR", 85, 82, 88);

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(s1);
		studentList.add(s2);
		
		
		itrVal(studentList);
		forEachVal(studentList);
		
		//Collections.sort(studentList);
		
		Collections.sort(studentList, new sortStudent());
		
		System.out.println("After short");
		itrVal(studentList);
		forEachVal(studentList);

	}

	private static Student addval1(String name, Integer M1, Integer M2,
			Integer M3) {

		Student student = new Student();
		student.setStdName(name);
		student.setSubOneMark(M1);
		student.setSubTwoMark(M2);
		student.setSubThreeMark(M3);
		return student;
	}

	private static <T>  void itrVal(List<T> AL) {

		System.out.println("IN FOR ITERATOR");

		Iterator<T> itr = AL.iterator();
		while (itr.hasNext()) {
			Student student = (Student) itr.next();
			System.out.println("Student Name  ---->" + student.getStdName());
			System.out.println("Subject MARK1 ---->" + student.getSubOneMark());
			System.out.println("Subject MARK2 ---->" + student.getSubTwoMark());
			System.out.println("Subject MARK3 ---->" + student.getSubTwoMark());
		}

	}


	private static void forEachVal(List<Student> AL) {
		System.out.println("IN FOR EACH");
		for (Student student : AL) {
			System.out.println("Student Name  ---->" + student.getStdName());
			System.out.println("Subject MARK1 ---->" + student.getSubOneMark());
			System.out.println("Subject MARK2 ---->" + student.getSubTwoMark());
			System.out.println("Subject MARK3 ---->" + student.getSubTwoMark());
		}
	}
	
	
	private static void nullPointerExample() {
	Student s=null;
		
		//Student s=new Student();
		
		//System.out.println("In side test..."+s.getStdName());
	     s.getStdName();
		
			}
	
	
	
	
	
	private static void convertingArrayToVarious() {
		
		            
                     
                    /*
                     * 
                     *  Convert Sentence to String arrayList
                     *  \\s Find Space in java
                     *  
                     *  */
                     
                    
                      String string2="Test Application";
                      
                      List<String> list=new ArrayList<String>(Arrays.asList(string2.split("\\s")));
                      
                      for (String string3 : list) {
                    	  
                    	  System.out.println("Convert Sentence to String array...."+string3);
						
					}
                      
                     
                     
                     
                     /*
                      * 
                      * Convert String to Character ArrayList Way 2
                      * */
                     
                     String string3="abcdabc";
                     Character[] c = new Character[string3.length()];
                     for (int i = 0; i<string3.length()-1; i++) {
                   // System.out.println(string3.charAt(i));
                    	c[i]=string3.charAt(i);
                     }
                  List<Character> list2=new ArrayList<Character>(Arrays.asList(c));  
                  for (Character character : list2) {
                	   System.out.println("Convert Array to List way Two...."+character);
				}
                  
                  
                  /*
		             * 
		             * Convert Array to List
		             * */
		  
		             String string="saravana"; // Declare a String 
		               
		             char[] charactersArray=string.toCharArray(); //Convert String to Array "char[] charArray = {'a', 'b', 'c'};"
		              
		             String str = String.valueOf(charactersArray); // Convert Char Array To String 
		                      
		             List<char[]> strList=Arrays.asList(charactersArray); // Convert Char Array to List
		              
		             List<char[]> strArrayList=new ArrayList<char[]>(strList);  // Convert Char Array to ArrayList
		            
		             
		             
		             char[] ca="saravanakumar".toCharArray();// Declare Char[] And Covert String To Array
		             
		             List<Character> charList=new ArrayList<Character>();    // Declare Character Array List
		             
		              for(Character c1:ca){  
		            	 charList.add(c1);
		              }
		                      
                    System.out.println("Convert Array to List way One...."+charList);
                   
                   
                   
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
				}

}


/*class sortStudent implements Comparable<Student>{


	public int compareTo(Student student1,Student student2) {
		// TODO Auto-generated method stub
		return student1.getStdName().compareToIgnoreCase(student2.getStdName());
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}



	
}	*/




class sortStudent implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStdName().compareToIgnoreCase(o2.getStdName());
	}






	
}	



class Student implements Comparable<Student>{
	
	private String stdName;
	private Integer subOneMark;
	private Integer subTwoMark;
	private Integer subThreeMark;
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Integer getSubOneMark() {
		return subOneMark;
	}
	public void setSubOneMark(Integer subOneMark) {
		this.subOneMark = subOneMark;
	}
	public Integer getSubTwoMark() {
		return subTwoMark;
	}
	public void setSubTwoMark(Integer subTwoMark) {
		this.subTwoMark = subTwoMark;
	}
	public Integer getSubThreeMark() {
		return subThreeMark;
	}
	public void setSubThreeMark(Integer subThreeMark) {
		this.subThreeMark = subThreeMark;
	}
	@Override
	public int compareTo(Student paramT) {
		// TODO Auto-generated method stub
		return this.stdName.compareTo(paramT.getStdName());
	}

	
	
	
	
}




