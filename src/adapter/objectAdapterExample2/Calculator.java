package adapter.objectAdapterExample2;

public class Calculator implements CalculatorInterface {
	
	Rectangle rectangle;

	@Override
	public double getArea(Rectangle rectangle) {
		this.rectangle = rectangle;
		return this.rectangle.length * this.rectangle.width;
	}

}
