package section3.interfaceSegregation;

// Not following interface segregation principle
public interface RestaurantInterface {

	public void acceptOnlineOrder();
	public void takeTelephoneOrder();
	public void payOnline();
	public void walkInCustomerOrder();
	public void payInPerson();
}

public class OnlineClientImpl implements RestaurantInterface {

	@Override
	public void acceptOnlineOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeTelephoneOrder() {
		// TODO Auto-generated method stub
		// Not Applicable
	}

	@Override
	public void payOnline() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walkInCustomerOrder() {
		// TODO Auto-generated method stub
		// Not Applicable
	}

	@Override
	public void payInPerson() {
		// TODO Auto-generated method stub
		// Not Appliable
	}
	
}
