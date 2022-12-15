package principles.interfaceSegregation;

// Not following interface segregation principle
public interface RestaurantInterface {

	public void acceptOnlineOrder();
	public void takeTelephoneOrder();
	public void payOnline();
	public void walkInCustomerOrder();
	public void payInPerson();
}
