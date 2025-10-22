package INHERITANCE;


//INHERITANCE
//definition= inheritance is the process of acquiring the properties and behaviour of a class by another class.

class Parent
{
	//properties
	float height=5.8f;
	String skinColor="brown";
	String noseStructure="normal";
	
	//behaviour
	void readBooks()
	{
		System.out.println("I Love reading books");
	}
	
	void noDrink()
	{
		System.out.println("I dont drink");
	}
	
	void noSmoke()
	{
		System.out.println("I dont smoke");
	}
}

class child extends Parent  //inheritance using extends from one class to another class
{
	
}


public class Demo01 {
	public static void main(String[] args)
	{
		child c=new child();
		System.out.println(c.height);
		System.out.println(c.skinColor);
		System.out.println(c.noseStructure);
		
		c.readBooks();
		c.noDrink();
		c.noSmoke();
	}

}
