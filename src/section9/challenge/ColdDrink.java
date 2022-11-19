package section9.challenge;

public abstract class ColdDrink  extends Item {
	
	public Packing pack() {
		Packing bottle = new Bottle();
		return bottle;
	}
}
