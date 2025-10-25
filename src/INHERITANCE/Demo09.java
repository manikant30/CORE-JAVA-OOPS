package INHERITANCE;

//PRIVATE MEMBER NOT INHERITANCE

class YourBank
{
	private int pin=12345;
}

class Hacker extends YourBank
{
	void change()
	{
		pin=9304989;
		System.out.println(pin);
	}
}

public class Demo09 {
	public static void main(String[] args)
	{
		Hacker h=new Hacker();
		h.change();
		
	}

}
