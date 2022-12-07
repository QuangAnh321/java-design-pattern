package section12.objectAdapterExample1;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Goggle gobble");
	}

	@Override
	public void fly() {
		System.out.println("I am flying a short distance");
	}

}
