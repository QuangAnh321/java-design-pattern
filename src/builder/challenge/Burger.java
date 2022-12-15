package builder.challenge;

public abstract class Burger extends Item {
	
	public Packing pack() {
		Packing wrapper = new Wrapper();
		return wrapper;
	}
}
