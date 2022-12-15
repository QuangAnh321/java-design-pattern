package builder.challenge;

public class NormalMealBuilder implements MealBuilder {
	
	private Meal normalMeal = new NormalMeal();

	@Override
	public void buildBurger() {
		Burger normalBurger = new ChickenBurger();
		normalMeal.addItems(normalBurger);
	}

	@Override
	public void buildDrink(ColdDrink coldDrink) {
		normalMeal.addItems(coldDrink);
	}

	@Override
	public Meal getMeal() {
		return normalMeal;
	}

}
