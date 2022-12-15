package factory.challenge;

public class Client {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal aRandomDuck = animalFactory.getAnimal("DUCK");
		Animal aRandomTiger = animalFactory.getAnimal("TIGER");
		
		aRandomDuck.move();
		aRandomTiger.move();
	}
}
