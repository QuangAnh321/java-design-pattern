package prototype.challenge;

public class Ford extends BasicCar {
	
	public Ford(String name, Double price) {
		super();
		super.setName(name);
		super.setPrice(price);
	}

	@Override
	void run() {
		System.out.println("Ford running fast");
	}

	@Override
	public Object clone() {
		Object cloneObject = new Ford(this.getName(), this.getPrice());;
		return cloneObject;
	}

}
