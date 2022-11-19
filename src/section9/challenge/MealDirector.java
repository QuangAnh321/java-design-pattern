package section9.challenge;

public class MealDirector {

	MealBuilder iMealBuilder;
	
	public void createMeal(MealBuilder builder, ColdDrink coldDrink) {
		iMealBuilder = builder;
		iMealBuilder.buildBurger();
		iMealBuilder.buildDrink(coldDrink);
		iMealBuilder.getMeal().showItems();
	}
}
