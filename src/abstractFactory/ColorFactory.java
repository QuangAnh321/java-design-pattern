package abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String colorType) {
		switch(colorType) {
		case "RED":
			return new Red();
		case "GREEN":
			return new Green();
		case "BLUE	":
			return new Blue();
		default:
			System.err.println("ColorType: "+colorType+" is invalid");
			return null;
		}
	}

	// Do nothing
	// Violate interface segregation principle
	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
