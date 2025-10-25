package INHERITANCE;

//constructor chaining

//super() = one class constructor to another class constructor call with the help of super().


//class Object
//{
//	13 method
//}

class test02 //extends Object
{
	int x,y;
	test02()
	{
		x=100;
		y=200;
	}
	
	test02(int x,int y)
	{
		//super() ,given by JVM
		this.x=x;
		this.y=y;
	}
}

class test3 extends test02
{
	int a,b;
	test3()
	{
		a=300;
		b=400;
	}
	
	test3(int a, int b)
	{
		super(a,b); //super given by programmer
		this.a=a;
		this.b=b;
	}
	
	void disp()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}

public class Demo13 {
	public static void main(String[] args)
	{
		test3 t=new test3(9,99);
		t.disp();
	}

}
