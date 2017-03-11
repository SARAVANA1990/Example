package interviewPrograms;

public class HandleException {
public static void main(String args[])
{
		int i=50;
		int j=0;
		int k=0;
		int a=0;
		try
		{
			k=i/j;
			System.out.println(k);
	     }
        catch(ArithmeticException e)
        {
			System.out.println("Exception"+e);
        }
		try
		{
			a=i+10;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
		try{
		
		}
         finally
		{
			System.out.println("ia am in finally block ");
		}
		
}
}

