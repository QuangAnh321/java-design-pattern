package factory.staticMethodCreator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = ShapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape rectangle = ShapeFactory.getShape("RECTANGLE");
		rectangle.draw();
	}

}
