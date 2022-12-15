package principles.interfaceSegregation;

public class Cube implements ManageShapeInterface, ShapeInterface, SolidShapeInterface {

	@Override
	public double volume() {
		return 1.0;
	}

	@Override
	public double area() {
		return 1.0;
	}

	@Override
	public double calculate() {
		return this.area() + this.volume();
	}

}
