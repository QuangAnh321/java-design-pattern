package principles.delegation;

public class Main {

	public static void main(String[] args) {
		// To the outside world, it looks like Printer actually prints by itself
		Printer printer = new Printer();
		printer.print();
	}

}
