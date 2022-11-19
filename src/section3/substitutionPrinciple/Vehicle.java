package section3.substitutionPrinciple;

public abstract class Vehicle {

	abstract int getSpeed();
	abstract int getCubicCapacity();
	
	public static void main(String[] args) {
		Vehicle bus = new Bus();
		bus.getSpeed();
		
		Vehicle car = new Car();
		car.getCubicCapacity();
	}
}

