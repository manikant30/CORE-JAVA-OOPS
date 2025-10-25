package INHERITANCE;

//THREE TYPE OF INHERITANCE METHOD
//1.INHERITED METHODS
//2.OVERRIDDEN METHODS
//3.SPECIALISED METHODS

class Plane
{
	void takeoff()
	{
		System.out.println("Plane takes-off");
	}

	void fly()
	{
		System.out.println("Plane flies");
	}

	void land()
	{
		System.out.println("Plane lands");
	}
}



class CargoPlane extends Plane
{
	@Override
	void fly()
	{
		System.out.println("CargoPlane flies at low heights ");
	}

	void carryCargo()
	{
		System.out.println("CargoPlane carries goods");
	}
}



class PassengerPlane extends Plane
{
	@Override
	void fly()
	{
		System.out.println("PassengerPlane flies at medium height ");
	}

	void CarryPassenger()
	{
		System.out.println("PassengerPlane carries passenger ");
	}

}



class FighterPlane extends Plane
{
	@Override
	void fly()
	{
		System.out.println("FighterPlane flies at any height ");
	}

	void CarryWeapons()
	{
		System.out.println("FighterPlane carries Weapons ");
	}
}



public class Demo16 {
	public static void main(String[] args)
	{
		CargoPlane cp=new CargoPlane();
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryCargo();
		System.out.println("------------------------------------");

		PassengerPlane pp=new PassengerPlane();
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.CarryPassenger();
		System.out.println("------------------------------------");

		FighterPlane fp=new FighterPlane();
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.CarryPassenger();
		System.out.println("------------------------------------");


	}

}
