package builder.challenge;

public interface MealBuilder {

	public void buildBurger();
	public void buildDrink(ColdDrink coldDrink);
	public Meal getMeal();
}
