package INHERITANCE;

//1. SINGLE-LEVEL INHERITANCE


class Parent1 
{

	float height=5.8f;

	void readBooks()
	{
		System.out.println("I love reading books");
	}
	
}

class Child extends Parent1
{ 

	
	
}

public class Demo02 {
	public static void main(String[] args)
	{
		Child c=new Child();
		System.out.println(c.height);
		c.readBooks();
	}

}
