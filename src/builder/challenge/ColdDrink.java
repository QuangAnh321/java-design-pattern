package builder.challenge;

public abstract class ColdDrink  extends Item {
	
	public Packing pack() {
		Packing bottle = new Bottle();
		return bottle;
	}
}
