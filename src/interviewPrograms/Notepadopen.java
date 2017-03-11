package interviewPrograms;
import java.util.*;
import java.io.*;
class Notepadopen
{
	public static void main(String a[])
	{
	try{
	Runtime rs=Runtime.getRuntime();
	rs.exec("notepad");
	}
	catch (IOException e){
	System.out.println(e);
	
	}
	}

}