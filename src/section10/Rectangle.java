package section10;

public class Rectangle extends Shape {
	
	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("Rectangle::draw(): Drawing a Rectangle");
	}

}
