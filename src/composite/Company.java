package composite;

public class Company {

	public static void main(String[] args) {
		Employee dev1 = new Developer("Jason", 1, "Junior Developer");
		Employee dev2 = new Developer("John", 2, "Senior Developer");
		
		Directory engineerDivision1 = new Directory();
		engineerDivision1.addEmployee(dev1);
		engineerDivision1.addEmployee(dev2);
		
		Employee manager1 = new Manager("Jennifer", 3, "Division 1 Manager");
		Employee manager2 = new Manager("Mike", 3, "John's Manager");
		
		// implementing ...
	}

}
