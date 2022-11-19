package section9.challenge;

public class VegetarianMealBuilder implements MealBuilder {
	
	private Meal vegetarianMeal = new VegetarianMeal();

	@Override
	public void buildBurger() {
		Burger vegBurger = new VegetarianBurger();
		vegetarianMeal.addItems(vegBurger);
	}

	@Override
	public void buildDrink(ColdDrink coldDrink) {
		vegetarianMeal.addItems(coldDrink);
	}

	@Override
	public Meal getMeal() {
		return vegetarianMeal;
	}

}
