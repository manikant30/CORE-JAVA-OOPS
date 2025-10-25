package INHERITANCE;

//FINAL
//2.METHOD

class Parentt12
{ 
	int a=10;
	float b=45.5f;
	char c='A';
	
	final void disp1()//final method we can't change the value only use it.
	{
		System.out.println("hi");
	}
	
	void disp2()
	{
		System.out.println("hello");
	}
}

public class Demo21{
	public static void main(String[] args)
	{
		Parentt12 p=new Parentt12();
		p.disp1();
		p.disp2();
	}

}
