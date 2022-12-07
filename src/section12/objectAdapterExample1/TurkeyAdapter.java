package section12.objectAdapterExample1;

public class TurkeyAdapter implements Duck {

	public Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		// Call turkey.fly() 5 times because turkey cannot fly as long as duck
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
