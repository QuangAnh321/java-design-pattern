package builder;

public class CarBuilder implements BuilderInterface {
	
	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("This is a body of the car");
	}

	@Override
	public void insertWheels() {
		product.add("These are 4 wheels of the car");
	}

	@Override
	public void addHeadlights() {
		product.add("These are 2 headlights of the car");
	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
