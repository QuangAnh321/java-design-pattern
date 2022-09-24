package section7;

public class Client {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape someCricle = shapeFactory.getShape("CIRCLE");
		someCricle.draw();
		Shape someRectangle = shapeFactory.getShape("RECTANGLE");
		someRectangle.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color someRed = colorFactory.getColor("RED");
		someRed.fill();
	}
}
