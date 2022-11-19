package section9.challenge;

public abstract class Burger extends Item {
	
	public Packing pack() {
		Packing wrapper = new Wrapper();
		return wrapper;
	}
}
