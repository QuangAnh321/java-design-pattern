package adapter.objectAdapterExample2;

public class CalculatorAdapter implements CalculatorInterface {
	
	Calculator calculator;
	Triangle triangle;
	
	public CalculatorAdapter(Triangle triangle) {
		this.triangle = triangle;
	}
	

	@Override
	public double getArea(Rectangle rectangle) {
		this.calculator = new Calculator();
		Rectangle myRectangle = new Rectangle();
		
		myRectangle.length = triangle.base;
		myRectangle.width = 0.5 * triangle.height;
		return calculator.getArea(myRectangle);
	}

}
