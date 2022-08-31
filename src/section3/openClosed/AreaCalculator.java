package section3.openClosed;

public class AreaCalculator {

	// Not following Open Closed Principle
//	public double calculateRectangleArea(Rectangle rectangle) {
//		return rectangle.length * rectangle.width;
//	}
//	
//	public double calculateCircleArea(Circle circle) {
//		return (22/7) * circle.radius * circle.radius;
//	}
	
	public double areaCalculator(Shape shape) {
		return shape.calculateArea();
	}
}
