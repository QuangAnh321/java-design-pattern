package builder.challenge;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Pouring in a bottle";
	}
	
	@Override
	public String toString() {
		return "Bottle";
	}

}
