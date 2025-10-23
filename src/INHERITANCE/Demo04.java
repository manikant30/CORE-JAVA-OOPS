package INHERITANCE;

//3.HIERARCHY

//one parent many child

class parent
{
	float height=5.4f;
	
	public void readBooks()
	{
		System.out.println("I love reading books");
	}
}

class child1 extends parent
{
	
}

class child2 extends parent
{
	
}

class child3 extends parent
{
	
}

public class Demo04 {
	public static void main(String[] args)
	{
		child1 c1=new child1();
		System.out.println(c1.height);
		c1.readBooks();
		
		child2 c2=new child2();
		System.out.println(c2.height);
		c2.readBooks();
		
		child3 c3=new child3();
		System.out.println(c3.height);
		c3.readBooks();
	}

}
