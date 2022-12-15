package factory.challenge;

public class AnimalFactory {

	public Animal getAnimal(String animalType) {
		switch (animalType) {
		case "DUCK":
			return new Duck();
		case "TIGER":
			return new Tiger();
		default:
			System.out.println("Animal type: "+animalType+" is invalid");
			return null;
		}
	}
}
