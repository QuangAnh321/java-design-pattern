package section3.delegation;

// The "Delegator"
public class Printer {
	
	RealPrinter printer = new RealPrinter();
	
	// create the delegate
	public void print() {
		// delegation
		printer.print();
	}
}
