package INHERITANCE;

//4. HYBRID INHERITANCE


class Grandparent
{
	float height=5.4f;

	public void readBooks()
	{
		System.out.println("I love reading books");
	}
}

class parent01 extends Grandparent
{


}

class Child01 extends parent
{

}

class Child02 extends parent
{

}

class Child03 extends parent
{

}

public class Demo05 {
	public static void main(String[] args)
	{
		Child01 c1=new Child01();
		System.out.println(c1.height);
		c1.readBooks();

		Child02 c2=new Child02();
		System.out.println(c2.height);
		c2.readBooks();

		Child03 c3=new Child03();
		System.out.println(c3.height);
		c3.readBooks();
	}

}
