package builder;

public class MotorCycleBuilder implements BuilderInterface {
	
	private Product product = new Product();

	@Override
	public void buildBody() {
		System.out.println("Assembling motorcycle body");
	}

	@Override
	public void insertWheels() {
		System.out.println("Insert 2 wheels to the motorcycle");
	}

	@Override
	public void addHeadlights() {
		System.out.println("Adding just one headlight");
	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
