package section6.abstractCreator;

public class Client {

	public static void main(String[] args) {
		
		Shape circle = new CircleFactory().getShape();
		circle.draw();
		
		Shape rectangle = new RectangleFactory().getShape();
		rectangle.draw();
	}
}
