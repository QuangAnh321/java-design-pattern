package prototype.challenge;

public abstract class BasicCar implements Cloneable {

	private String id;
	protected String name;
	protected Double price;
	
	abstract void run();
	
	public BasicCar() {
		price = 10.0;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public abstract Object clone();
}
