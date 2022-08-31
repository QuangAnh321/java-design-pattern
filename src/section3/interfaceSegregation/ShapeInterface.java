package section3.interfaceSegregation;

// Violate interface Segregation Principle
public interface ShapeInterface {
	
	public double area();
	
	// Not all shape have volume. If double volume is here, this interface will violate interface Segregation Principle
//	public double volume();

}
