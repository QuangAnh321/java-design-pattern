package factory.staticMethodCreator;

public class ShapeFactory {

	public static Shape getShape(String shapeType) {
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
