package section12.objectAdapterExample2;

public class Client {

	public static void main(String[] args) {
		System.out.println("***Adapter Pattern Demo***");
		
		Triangle triangle = new Triangle (20, 10);
		
		CalculatorInterface calAdapter = new CalculatorAdapter(triangle);
		
		System.out.println("Area of triangle is: "+calAdapter.getArea(null));
	}

}
