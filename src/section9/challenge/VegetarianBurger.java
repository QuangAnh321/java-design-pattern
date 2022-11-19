package section9.challenge;

public class VegetarianBurger extends Burger {

	@Override
	public String getName() {
		return "Vegan Burger";
	}

	@Override
	public int getPrice() {
		return 10;
	}

}
