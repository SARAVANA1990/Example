package interviewPrograms;

public class RemoveDublicatecharacterFromString {
	

	public static void main(String args[])
	{
		String str="aaaa bbbb";
		
		System.out.println(removeDuplicates(str));
	   /* String result= new String();
		for(int i=0;i<=str.length();i++){
			for(int j=0;j<=result.length();j++){
				if(str.charAt(i) != result.charAt(j)){
					result= result+ str.charAt(i);
				}
			}
		}

		System.out.println("result----->"+result);*/
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
