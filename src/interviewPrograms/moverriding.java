package interviewPrograms;
class A2
{
	void add(int i,int j)
	{
	System.out.println("i am A class");
	System.out.println("i="+i);
	System.out.println("j="+j);
	}
}
class B2 extends A2{
	void add(int i,int j)
	{
	//super.add(200,300);
	//this.add(1000,2000);
	System.out.println("i am B class");
	System.out.println("i="+i);
	System.out.println("j="+j);
	}
	void add()
	{
	super.add(200,300);
	this.add(1000,2000);
	}
}
class moverriding
{
	public static void main(String...args)
	{
	B2 a1=new B2();
	a1.add();
	//B a2=new B();
	//a2.add(100,200);
	
	}
}