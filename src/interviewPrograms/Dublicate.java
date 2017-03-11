package interviewPrograms;
class Dublicate
{
   public static void main(String args[])
		{
		
		int count=0;
		String s="selathurail";
	String result=null;;
		s=s.toUpperCase();
		for(int i=0;i<=s.length()-1;i++)
			{
			for(int j=1+i;j<s.length()-1;j++)
			{
			if(s.charAt(i)==s.charAt(j)){
				result=s.substring(0, i) + s.substring(i+1);
			}
			}
		}
		System.out.println(result);
	
		
		}

}