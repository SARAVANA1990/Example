package interviewPrograms;
class Mt extends Thread{
	public void run()
	{
		for(int i=10;i<=100;i=i+10)
		{
			System.out.println(" "+i );
			try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);} 
			System.out.println("Sleep");
		}
	}
}
class Multithreading{
public static void main(String a[])
{
	Mt t1=new Mt();
	t1.start();
}
}