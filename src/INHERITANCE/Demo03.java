package INHERITANCE;

//2. MULTI-LEVEL INHERITANCE


class GrandParent
{
	float height=5.8f;

	void readBooks()
	{
		System.out.println("I love reading books");
	}
	
}


class Parent2 extends GrandParent
{
	
	
}


class Child1 extends Parent2
{ 

	
	
}

public class Demo03 {
	public static void main(String[] args)
	{
		Child1 c=new Child1();
		System.out.println(c.height);
		c.readBooks();
	}

}
