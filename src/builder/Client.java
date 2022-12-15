package builder;

public class Client {

	public static void main(String[] args) {
		System.out.println("===Builder Pattern Demo===");
		
		Director director = new Director();
		
		BuilderInterface carBuilder = new CarBuilder();
		BuilderInterface motorCycleBuilder = new MotorCycleBuilder();
		
		director.construct(carBuilder);
		Product p1 = carBuilder.getVehicle();
		p1.show();
		
		System.out.println();
		
		director.construct(motorCycleBuilder);
		Product p2 = motorCycleBuilder.getVehicle();
		p2.show();
	}
}
