package interviewPrograms;

public class EachWordReverceInString {
	
	public static void main(String args[]){
		String orginalStr="I want to reverce";
		String arr[]=orginalStr.split(" ");
	
		for(String s:arr){
		 System.out.print(strRev(s));	
		}
		
	}
	private static String strRev(String str){
		char chr[]=str.toCharArray();
		//char s[] = new char[0];
		int j=0;
		char[] s = null;
		for(int i=chr.length-1;i>=0;i--){
			 s[j++]=chr[i];
			
		
		}
		
		
		return s.toString();
	}

}
