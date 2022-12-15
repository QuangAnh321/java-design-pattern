package abstractFactory;

public class ShapeFactory extends AbstractFactory {

	// Do nothing
	// Violate interface segregation principle
	@Override
	Color getColor(String colorType) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		switch(shapeType) {
		case "CIRCLE":
			return new Circle();
		case "RECTANGLE":
			return new Rectangle();
		case "SQUARE":
			return new Square();
		default:
			System.err.println("ShapeType: "+shapeType+" is invalid");
			return null;
		}
	}

}
