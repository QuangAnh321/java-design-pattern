package section12.objectAdapterExample1;

public class Client {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says ...\n");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says ...\n");
		testDuck(duck);
		
		System.out.println("\nThe Turkey Adapter says ...\n");
		testDuck(turkeyAdapter);
	}
	
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
