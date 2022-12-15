package factory.abstractCreator;

public abstract class AbstractShapeFactory {

	protected abstract Shape factoryMethod();
	
	public Shape getShape() {
		return factoryMethod();
	}
	
	// other helper method

}

class RectangleFactory extends AbstractShapeFactory {
	
	protected Shape factoryMethod() {
		return new Rectangle();
	}
}

class CircleFactory extends AbstractShapeFactory {
	
	protected Shape factoryMethod() {
		return new Circle();
	}
}

class SquareFactory extends AbstractShapeFactory {
	
	protected Shape factoryMethod() {
		return new Square();
	}
}
