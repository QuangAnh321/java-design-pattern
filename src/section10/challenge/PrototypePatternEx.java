package section10.challenge;

public class PrototypePatternEx {

	public static void main(String[] args) {
		BasicCarCache.loadCache();
		
		System.out.println("***Prototype Pattern Demo***");
		
		BasicCar clonedBasicCar = (BasicCar) BasicCarCache.getBasicCar("1");
		System.out.println("Car is: "+clonedBasicCar.getName()+" and it's price is "+clonedBasicCar.getPrice());
		
		BasicCar clonedBasicCar2 = (BasicCar) BasicCarCache.getBasicCar("2");
		System.out.println("Car is: "+clonedBasicCar2.getName()+" and it's price is "+clonedBasicCar2.getPrice());
	}

}
