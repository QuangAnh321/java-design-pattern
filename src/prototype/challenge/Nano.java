package prototype.challenge;

public class Nano extends BasicCar {
	
	public Nano(String name, Double price) {
		super();
		super.setName(name);
		super.setPrice(price);
	}

	@Override
	void run() {
		System.out.println("Nano running slow");
	}

	@Override
	public Object clone() {
		Object cloneObject = new Nano(this.getName(), this.getPrice());;
		return cloneObject;
	}

}
