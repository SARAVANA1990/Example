package interviewPrograms;

public class RemoveDublicatecharacterFromString {
	

	public static void main(String args[])
	{
		String str="aaaa bbbb";
		System.out.println(removeDuplicates(str));
	}
	
	
	public static String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}
}
