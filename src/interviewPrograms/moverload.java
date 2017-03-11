package interviewPrograms;

class A
{
	void add(int i,int j)
	{
	System.out.println("i="+i);
	System.out.println("j="+j);
	}
}
class B extends A{
	void add(int i,long j)
	{
	System.out.println("i="+i);
	System.out.println("j="+j);
	}
}
class moverload
{
	public static void main(String...args)
	{
	B a1=new B();
	a1.add(10,20);
	a1.add(100,200l);
	}
}