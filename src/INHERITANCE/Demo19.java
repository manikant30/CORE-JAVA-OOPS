package INHERITANCE;

//FINAL
//WE INHERITATE ONLY VARIABLE VALUE THE FINAL AND USE IT BUT CAN'T CHANGE VALUE.
//we can't change the value where declared final key word but we INHERITED the value of variable.

//1.FINAL VARIABLE
class Parent23 
{
	 final float pi=3.142f; 	
}

class Child23 extends Parent23
{
	void change()
	{
		System.out.println(pi);
	}
}

public class Demo19 {
	public static void main(String[] args)
	{
		Child23 p=new Child23();
	    p.change();
	}

}
