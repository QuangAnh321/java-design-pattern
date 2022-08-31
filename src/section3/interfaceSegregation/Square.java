package section3.interfaceSegregation;

public class Square implements ManageShapeInterface, ShapeInterface {

	@Override
	public double area() {
		return 2.0;
	}

	@Override
	public double calculate() {
		return this.area();
	}

}
