package section7;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		switch (choice) {
		case "SHAPE":
			return new ShapeFactory();
		case "COLOR":
			return new ColorFactory();
		default:
			System.err.println("Choice: "+choice+" is invalid");
			return null;
		}
	}
}
