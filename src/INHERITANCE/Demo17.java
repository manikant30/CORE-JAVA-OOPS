package INHERITANCE;

//inheritance assignment HW 


class Animal
{
	void Breath()
	{
		System.out.println("Animal takes Breath");
	}
	
	void Eat()
	{
		System.out.println("Animal eat foods");
	}
	
	void Sleep()
	{
		System.out.println("Animal sleep");
	}
}

class Deer extends Animal
{
	@Override
	void Eat()
	{
		System.out.println("Deer eats leaf");
	}
	
	@Override
	void Sleep()
	{
		System.out.println("Deer sleep in forest");
	}
	
	//specilized
	void RunFast()
	{
		System.out.println("Deer run fast");
	}
	
	//specilized
	void LiveInForest()
	{
		System.out.println("Deer live in forest");
	}
}


class Lion extends Animal
{
	@Override
	void Breath()
	{
		System.out.println("Lion Breath");
	}
	
	@Override
	void Eat()
	{
		System.out.println("Lion eats Meats");
	}
	
	//specilized
	void RunFast()
	{
		System.out.println("Lion run fast");
	}
	
}

class Monkey extends Animal
{
	@Override
	void Breath()
	{
	    System.out.println("Monkey breath ");	
	}
	@Override
	void Eat()
	{
		System.out.println("Monkey eats Banana");
	}
	
	@Override
	void Sleep()
	{
		System.out.println("Monkey sleep in forest");
	}
	
	//specilized
	void RunFast()
	{
		System.out.println("Monkey run fast");
	}
	
	//specilized
	void LiveInForest()
	{
		System.out.println("Monkey live in forest");
	}
}

public class Demo17 {
	public static void main(String[] args)
	{
		Deer d=new Deer();
		d.Breath();
		d.Eat();
		d.Sleep();
		d.RunFast();
		d.LiveInForest();
		System.out.println("--------------------------------------");
		
		Lion l=new Lion();
		l.Breath();
		l.Eat();
		l.Sleep();
		l.RunFast();
		System.out.println("--------------------------------------");
		
		Monkey m=new Monkey();
		m.Breath();
		m.Eat();
		m.Sleep();
		m.RunFast();
		m.LiveInForest();
		
	}

}
